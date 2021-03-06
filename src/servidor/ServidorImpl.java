/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import sop_corba.ClienteInt;
import sop_corba.ServidorAudioIntPOA;
import sop_corba.ServidorAudioIntPackage.Usuario;
import sop_corba.ServidorAudioIntPackage.audioHolder;


/**
 *
 * @author philipretl
 */
    public class ServidorImpl extends ServidorAudioIntPOA {
    private ArrayList<ClienteInt> usuarios;
    private ArrayList<String> datosUsuarios;
    
    public ServidorImpl(){
        usuarios = new ArrayList();
        datosUsuarios = new ArrayList();
    }
    
  /*  @Override
    public boolean registrarCliente(ClienteInt objcllbck, String usuario) {
        boolean registro = false;
        
        if(!usuarios.contains(objcllbck)){
            registro= usuarios.add(objcllbck);
            datosUsuarios.add(usuario);
            notificar();
        
        }
        if(registro)
            System.out.println("El usuario" + usuario + "se registro");
        else
            System.out.println("El usuario" + usuario + "no se registro");
        
        return registro;
    }

    @Override
    public void enviarMensaje(String usuario, String mensaje) {
        for(ClienteInt cliente: usuarios)
            cliente.recibirMensaje(usuario, mensaje);
    }

    @Override
    public boolean desconectarCliente(ClienteInt objcllbck, String usuario) {
        boolean flag=false;
        
         if(usuarios.contains(objcllbck)){
            
            usuarios.remove(objcllbck);
            datosUsuarios.remove(usuario);
            enviarMensaje(objcllbck.obtenerNombre(),  usuario + " se desconecto...");
            
            notificar();
           
        }
        
        return flag;
    }

    @Override
    public datosUsuario[] obtenerUsuariosConectados() {
        datosUsuario[] datos= new datosUsuario[usuarios.size()];
        //datosUsuario [] datos= usuarios.toArray(new datosUsuario[usuarios.size()]);
        for (int i = 0; i < usuarios.size(); i++) {
            datosUsuario dato = new datosUsuario(usuarios.get(i).obtenerNombre());
            datos[i]=dato;
            System.out.println(""+usuarios.get(i).obtenerNombre());
        }
             
             
        
        //datos = usuarios.toArray(datos);
        return datos;
    }

    @Override
    public boolean establecerSesionPriv(String usuario1, String usuario2) {
        boolean flag=false;
        int cont=0;
        for(ClienteInt cliente:usuarios){
            if(cliente.obtenerNombre().equals(usuario1))
                cont++;
            if(cliente.obtenerNombre().equals(usuario2))
                cont++;
        }
        if(cont!=0){
            for(ClienteInt cliente:usuarios){
                if(cliente.obtenerNombre().equals(usuario2))
                cliente.establecerSesionPrivada(usuario1);        
            }
            flag=true;
        }    
       return flag; 
    }

    @Override
    public boolean enviarMensajePriv(String us1, String us2, String mensaje) {
        boolean flag=false;
        for(ClienteInt cliente: usuarios){
            if(cliente.obtenerNombre().equals(us1)){
                cliente.recibirMensajePrivado(us2, mensaje);
                flag=true;
            }    
        }    
        for(ClienteInt cliente2: usuarios){
            if(cliente2.obtenerNombre().equals(us2)){
                cliente2.recibirMensajePrivado(us2, mensaje);
                flag=true;
            }
        }
        
      
        
        return flag;
    }*/
    
    public void notificar(){
        for(ClienteInt cliente:usuarios){
            cliente.borrarListaDeContactos();
            for(ClienteInt usuario:usuarios){
                if(usuario!=cliente){
                    cliente.recibirContacto(usuario.obtenerNombre());
                }
            }
        
        
        }
    }

    @Override
    public boolean registrarCliente(ClienteInt objcllbck, String usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void enviarMensaje(String usuario, String mensaje) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean desconectarCliente(ClienteInt objcllbck, String usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario[] obtenerUsuariosConectados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean establecerSesionPriv(String usuario1, String usuario2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean enviarMensajePriv(String us1, String us2, String mensaje) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void enviarAudio(audioHolder audioStreaming) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void registrarRR() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
