package com.example.data;

import java.sql.DriverManager;
import java.sql.SQLException;

public class resultadoDao {

    private final String USER = "rm99627";
    private final String PASS = "051298";
    private final String URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl";

    public void inserir(Integer ptsJogador, Integer ptsComputador, String vencedor)
            throws SQLException {
        var con = DriverManager.getConnection(URL, USER, PASS);

        var sql = "INSERT INTO Resultados21 (pts_jogador, pts_computador, vencedor) VALUES (?, ?, ?)";
        var instrucao = con.prepareStatement(sql);
        instrucao = con.prepareStatement(sql);
        instrucao.setInt(1, ptsJogador);
        instrucao.setInt(2, ptsComputador);
        instrucao.setString(3, vencedor);

        instrucao.executeUpdate();

        con.close();
    }

    public static void inserir(resultadoDao resultado) {
    }

}