package sop_corba.AdministradorIntPackage;


/**
* sop_corba/AdministradorIntPackage/Administrador.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from registro.idl
* lunes 18 de junio de 2018 01H14' COT
*/

public final class Administrador implements org.omg.CORBA.portable.IDLEntity
{
  public String login = null;
  public String clave = null;

  public Administrador ()
  {
  } // ctor

  public Administrador (String _login, String _clave)
  {
    login = _login;
    clave = _clave;
  } // ctor

} // class Administrador