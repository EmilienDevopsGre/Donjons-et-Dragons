package com.example;

import players.Magician;
import players.Player;
import players.Warrior;
import players.attack.Spell;
import players.attack.Weapon;
import players.defense.Philtre;
import players.defense.Shield;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Application {
    private static Connection connection;

    private void openDatabaseConnection() throws SQLException {
        System.out.println("Opening database connection...");

        connection = DriverManager.getConnection(
                "jdbc:mariadb://localhost:3306/donjondragon_jdbc",
                "root", "root"
        );

        System.out.println("Connection valid: " + connection.isValid(0));
    }


    private void closeDatabaseConnection() throws SQLException {
        connection.close();
        System.out.println("Connection valid: " + connection.isValid(0));

    }

    public void insertHero(Player player) {
        try {
            openDatabaseConnection();

            PreparedStatement preparedStatement = connection.prepareStatement("" +
                    "INSERT INTO hero(type, nom, niveau_vie, niveau_force, arme_ou_sort, bouclier) " +
                    "values(?,?,?,?,?,?) ");

            preparedStatement.setString(1, player.getType());
            preparedStatement.setString(2, player.getName());
            preparedStatement.setInt(3, player.getLife());
            preparedStatement.setInt(4, player.getForce());
            preparedStatement.setString(5, player.getOffensiveEquipment().getType());
            preparedStatement.setString(6, player.getDefensiveEquipment().getType());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        }
    }


    public void updateHero(Player player) {
        try {
            openDatabaseConnection();

            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE " +
                    "hero SET type = ?, nom = ?, niveau_vie = ?, niveau_force ?, arme_ou_sort ?, bouclier ? " +
                    "WHERE id = ? ");

            preparedStatement.setString(1, player.getType());
            preparedStatement.setString(2, player.getName());
            preparedStatement.setInt(3, player.getLife());
            preparedStatement.setInt(4, player.getForce());
            preparedStatement.setString(5, player.getOffensiveEquipment().getType());
            preparedStatement.setString(6, player.getDefensiveEquipment().getType());
            preparedStatement.setInt(7, player.getId());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void deleteHero(Player player) {
        try {
            openDatabaseConnection();

            PreparedStatement preparedStatement = connection.prepareStatement("DELETE " +
                    " FROM hero " +
                    "WHERE id = ? ");
            preparedStatement.setInt(1, player.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public List<Player> selectHero() {
        List<Player> players = new ArrayList<>();
        try {
            openDatabaseConnection();

            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * " +
                    " FROM hero ");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                if (resultSet.getString("type").equals("warrior")) {
                    players.add(new Warrior(resultSet.getInt("id"),
                            resultSet.getString("type"),
                            resultSet.getString("nom"),
                            resultSet.getInt("niveau_vie"),
                            resultSet.getInt("niveau_force"),
                            new Weapon(),
                            new Shield()
                    ));
                }else{
                    players.add(new Magician(resultSet.getInt("id"),
                            resultSet.getString("type"),
                            resultSet.getString("nom"),
                            resultSet.getInt("niveau_vie"),
                            resultSet.getInt("niveau_force"),
                            new Spell(),
                            new Philtre()
                    ));
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return players;
    }

}
