package org.challanges.designpatterns.sistemagerenciamento;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class UserManager {

    private final List<User> users = new ArrayList<>();

    public UserManager() {
    }

    public void adicionarNovoUsuario(){
        Scanner dadosEntrada = new Scanner(System.in);
        System.out.println("Quantos usuários deseja cadastrar? ");
        int qtdeUsers = dadosEntrada.nextInt();

        for(int i = 0; i < qtdeUsers; i++){
            String nome;
            System.out.println("Nome: ");
            nome = dadosEntrada.next();

            User user = new User(nome);
            users.add(user);
        }

       listarUsers();
    }

    public void listarUsers(){
        System.out.println("======USUÁRIOS CADASTRADOS======");
        for (User us : users) {
            System.out.println(us.getId() + " - " + us.getNome());
        }
    }
}
