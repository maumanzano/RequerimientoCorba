package sop_corba.AdministradorIntPackage;

/**
* sop_corba/AdministradorIntPackage/UsuarioHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from registro.idl
* lunes 18 de junio de 2018 01H14' COT
*/

public final class UsuarioHolder implements org.omg.CORBA.portable.Streamable
{
  public sop_corba.AdministradorIntPackage.Usuario value = null;

  public UsuarioHolder ()
  {
  }

  public UsuarioHolder (sop_corba.AdministradorIntPackage.Usuario initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = sop_corba.AdministradorIntPackage.UsuarioHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    sop_corba.AdministradorIntPackage.UsuarioHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return sop_corba.AdministradorIntPackage.UsuarioHelper.type ();
  }

}