package Controller;

import View.View_Menu;

public class Controller_Menu {

    private View_Menu viewMenu;
    private int opcao;

    public Controller_Menu(){
        viewMenu = new View_Menu();

        int response = viewMenu.listaMenu();
        System.out.println(response);

        while (response != 3){
            if (response == 1){
                cadastrarUsuarioPedido();
            } else {
                visualizarPedidoController();
            }
        }
    }
}
