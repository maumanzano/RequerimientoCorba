package sop_corba;


/**
* sop_corba/ServidorAudioIntPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from registro.idl
* lunes 18 de junio de 2018 01H14' COT
*/

public abstract class ServidorAudioIntPOA extends org.omg.PortableServer.Servant
 implements sop_corba.ServidorAudioIntOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("registrarCliente", new java.lang.Integer (0));
    _methods.put ("enviarMensaje", new java.lang.Integer (1));
    _methods.put ("desconectarCliente", new java.lang.Integer (2));
    _methods.put ("obtenerUsuariosConectados", new java.lang.Integer (3));
    _methods.put ("establecerSesionPriv", new java.lang.Integer (4));
    _methods.put ("enviarMensajePriv", new java.lang.Integer (5));
    _methods.put ("enviarAudio", new java.lang.Integer (6));
    _methods.put ("registrarRR", new java.lang.Integer (7));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // sop_corba/ServidorAudioInt/registrarCliente
       {
         sop_corba.ClienteInt objcllbck = sop_corba.ClienteIntHelper.read (in);
         String usuario = in.read_string ();
         boolean $result = false;
         $result = this.registrarCliente (objcllbck, usuario);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 1:  // sop_corba/ServidorAudioInt/enviarMensaje
       {
         String usuario = in.read_string ();
         String mensaje = in.read_string ();
         this.enviarMensaje (usuario, mensaje);
         out = $rh.createReply();
         break;
       }

       case 2:  // sop_corba/ServidorAudioInt/desconectarCliente
       {
         sop_corba.ClienteInt objcllbck = sop_corba.ClienteIntHelper.read (in);
         String usuario = in.read_string ();
         boolean $result = false;
         $result = this.desconectarCliente (objcllbck, usuario);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 3:  // sop_corba/ServidorAudioInt/obtenerUsuariosConectados
       {
         sop_corba.ServidorAudioIntPackage.Usuario $result[] = null;
         $result = this.obtenerUsuariosConectados ();
         out = $rh.createReply();
         sop_corba.ServidorAudioIntPackage.listUsuariosHelper.write (out, $result);
         break;
       }

       case 4:  // sop_corba/ServidorAudioInt/establecerSesionPriv
       {
         String usuario1 = in.read_string ();
         String usuario2 = in.read_string ();
         boolean $result = false;
         $result = this.establecerSesionPriv (usuario1, usuario2);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 5:  // sop_corba/ServidorAudioInt/enviarMensajePriv
       {
         String us1 = in.read_string ();
         String us2 = in.read_string ();
         String mensaje = in.read_string ();
         boolean $result = false;
         $result = this.enviarMensajePriv (us1, us2, mensaje);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 6:  // sop_corba/ServidorAudioInt/enviarAudio
       {
         sop_corba.ServidorAudioIntPackage.audioHolder audioStreaming = new sop_corba.ServidorAudioIntPackage.audioHolder ();
         this.enviarAudio (audioStreaming);
         out = $rh.createReply();
         sop_corba.ServidorAudioIntPackage.audioHelper.write (out, audioStreaming.value);
         break;
       }

       case 7:  // sop_corba/ServidorAudioInt/registrarRR
       {
         this.registrarRR ();
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:sop_corba/ServidorAudioInt:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public ServidorAudioInt _this() 
  {
    return ServidorAudioIntHelper.narrow(
    super._this_object());
  }

  public ServidorAudioInt _this(org.omg.CORBA.ORB orb) 
  {
    return ServidorAudioIntHelper.narrow(
    super._this_object(orb));
  }


} // class ServidorAudioIntPOA