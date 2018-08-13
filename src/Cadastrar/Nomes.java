/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadastrar;

import javax.swing.JOptionPane;

/**
 *
 * @author Tamires
 */
public class Nomes {

    public static void main(String[] args) {
        String nome[] = new String[3];
        boolean logico = false;
        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("\n *** DIGITE A OPCAO ***\n"
                    + "[1] Cadastrar Nome\n"
                    + "[2] Listar\n"
                    + "[3] Pesquisar\n"
                    + "[4] Sair\n"));
            int i;
            switch (op) {
                //cadastrar
                case 1:
                    for (i = 0; i < nome.length; i++) {
                        nome[i] = JOptionPane.showInputDialog("Digite o nome");
                    }
                    break;

                //listar
                case 2:
                    for (i = 0; i < nome.length; i++) {
                        System.out.println("Nome:" + nome[i]);
                    }
                    break;

                //pesquisar
                case 3:
                    String pesquisar = JOptionPane.showInputDialog("Digite o nome que deseja pesquisar: ");
                    logico = false;
                    for (i = 0; i < nome.length; i++) {
                        if (pesquisar.equals(nome[i])) {
                            JOptionPane.showMessageDialog(null, "Nome" + pesquisar + "cadastrato");
                            logico = true;
                        }
                    }
                    if (logico == false) {
                        JOptionPane.showMessageDialog(null, "Nome" + pesquisar + "nao cadastrado");
                    }
                    break;
                case 4:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Valor errado");

            }
        }while (op != 4);

        }
        
    }
