package sop_corba;


/**
* sop_corba/_AdministradorIntStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from registro.idl
* lunes 18 de junio de 2018 01H14' COT
*/

public class _AdministradorIntStub extends org.omg.CORBA.portable.ObjectImpl implements sop_corba.AdministradorInt
{

  public void registrarUsuario (sop_corba.AdministradorIntPackage.Usuario objUsuario)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("registrarUsuario", true);
                sop_corba.AdministradorIntPackage.UsuarioHelper.write ($out, objUsuario);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                registrarUsuario (objUsuario        );
            } finally {
                _releaseReply ($in);
            }
  } // registrarUsuario

  public sop_corba.AdministradorIntPackage.Usuario[] listarUsuarios ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("listarUsuarios", true);
                $in = _invoke ($out);
                sop_corba.AdministradorIntPackage.Usuario $result[] = sop_corba.AdministradorIntPackage.listUsuariosHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return listarUsuarios (        );
            } finally {
                _releaseReply ($in);
            }
  } // listarUsuarios

  public void iniciarSesion (sop_corba.AdministradorIntPackage.Administrador objAdministrador)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("iniciarSesion", true);
                sop_corba.AdministradorIntPackage.AdministradorHelper.write ($out, objAdministrador);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                iniciarSesion (objAdministrador        );
            } finally {
                _releaseReply ($in);
            }
  } // iniciarSesion

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:sop_corba/AdministradorInt:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _AdministradorIntStub
