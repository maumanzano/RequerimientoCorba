package sop_corba.AdministradorIntPackage;

/**
* sop_corba/AdministradorIntPackage/AdministradorHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from registro.idl
* lunes 18 de junio de 2018 01H14' COT
*/

public final class AdministradorHolder implements org.omg.CORBA.portable.Streamable
{
  public sop_corba.AdministradorIntPackage.Administrador value = null;

  public AdministradorHolder ()
  {
  }

  public AdministradorHolder (sop_corba.AdministradorIntPackage.Administrador initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = sop_corba.AdministradorIntPackage.AdministradorHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    sop_corba.AdministradorIntPackage.AdministradorHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return sop_corba.AdministradorIntPackage.AdministradorHelper.type ();
  }

}
