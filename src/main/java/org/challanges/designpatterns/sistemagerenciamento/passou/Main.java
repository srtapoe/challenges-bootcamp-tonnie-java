package org.challanges.designpatterns.sistemagerenciamento.passou;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/*
    Versão que passou nos testes do sistema da DIO e
    foi enviado no final
 */
public class Main {

    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        userManager.adicionarNovoUsuario();
    }

    public static class User {

        private static int nextId = 1;
        private int id;
        private String nome;

        public User() {
        }

        User(String nome) {
            this.id = nextId++;
            this.nome = nome;
        }

        public int getId() {
            return id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }
    }

    public static class UserManager {

        private final List<User> users = new ArrayList<>();

        public UserManager() {
        }

        public void adicionarNovoUsuario() {
            Scanner dadosEntrada = new Scanner(System.in);
            int qtdeUsers = dadosEntrada.nextInt();

            for (int i = 0; i < qtdeUsers; i++) {
                String nome;
                nome = dadosEntrada.next();

                User user = new User(nome);
                users.add(user);
            }

            listarUsers();
        }

        public void listarUsers() {
            for (User us : users) {
                System.out.println(us.getId() + " - " + us.getNome());
            }
        }
    }
}
