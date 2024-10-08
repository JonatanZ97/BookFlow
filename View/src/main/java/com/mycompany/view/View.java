package com.mycompany.view;

import ModelException.ModelException;

/**
 *
 * @author 54234
 */
public class View {

    public static void main(String[] args) throws ModelException {
        System.out.println("SOFTWARE INICIADO");

        Login login = new Login();
        login.setVisible(true);

    }
}
