package sop_corba.ServidorAudioIntPackage;


/**
* sop_corba/ServidorAudioIntPackage/listUsuariosHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from registro.idl
* lunes 18 de junio de 2018 01H14' COT
*/

abstract public class listUsuariosHelper
{
  private static String  _id = "IDL:sop_corba/ServidorAudioInt/listUsuarios:1.0";

  public static void insert (org.omg.CORBA.Any a, sop_corba.ServidorAudioIntPackage.Usuario[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static sop_corba.ServidorAudioIntPackage.Usuario[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = sop_corba.ServidorAudioIntPackage.UsuarioHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (sop_corba.ServidorAudioIntPackage.listUsuariosHelper.id (), "listUsuarios", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static sop_corba.ServidorAudioIntPackage.Usuario[] read (org.omg.CORBA.portable.InputStream istream)
  {
    sop_corba.ServidorAudioIntPackage.Usuario value[] = null;
    int _len0 = istream.read_long ();
    value = new sop_corba.ServidorAudioIntPackage.Usuario[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = sop_corba.ServidorAudioIntPackage.UsuarioHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, sop_corba.ServidorAudioIntPackage.Usuario[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      sop_corba.ServidorAudioIntPackage.UsuarioHelper.write (ostream, value[_i0]);
  }

}
