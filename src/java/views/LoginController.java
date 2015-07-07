/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package views;

import entities.Usuarios;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Alexandra
 */
public class LoginController {

    private Usuarios usuarios=new Usuarios();

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }
    
    /**
     * Creates a new instance of LoginController
     */
    public LoginController() {
    }
    
    public String autenticar(){
        return null;
    }
    
}
