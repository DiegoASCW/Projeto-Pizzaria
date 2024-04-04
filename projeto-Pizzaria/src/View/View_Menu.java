package View;

import java.util.Scanner;

public class View_Menu {

    private Scanner terminal;

    public View_Menu(){
        this.terminal = new Scanner(System.in);
    }

    public int listaMenu(){
        System.out.println("-=-=-=-[Menu]-=-=-=-\n[1] - Cadastrar novo pedido\n[2] - Valor Total do Pedido\n[3] - Sair");
        return terminal.nextInt();
    }

}
