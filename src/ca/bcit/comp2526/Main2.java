package ca.bcit.comp2526;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

/**
 * @author Marcos Garcia
 * @version June 04 2020
 *
 * StreamUtils
 */
public class Main2 {

    public static void main(final String[] argv) { //main should never throw an exception




        final byte[] data;
        data = new byte[]{ (byte)0xCA, (byte)0xFE, (byte)0xBA, (byte)0xBD };
        try(final DataInputStream stream = new DataInputStream(new ByteArrayInputStream(data))) {


//            System.out.println(stream);
//            System.out.println(stream.read());
//            System.out.println(stream.read());
            final byte b = StreamUtils.readByte(stream);
            System.out.println(b);

//            stream.readByte();
//"Magic number must be 3405691582, was: 3405691581"

        } catch (final IOException | NotEnoughDataException ex) {
            System.out.println(ex.getLocalizedMessage());
            ex.printStackTrace(); //but it'll crash

        }
    }

}
