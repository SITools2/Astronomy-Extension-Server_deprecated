package nom.tam.fits.utilities;

import nom.tam.fits.*;
import nom.tam.util.*;

public class FitsCopy {

    public static void main(String[] args) throws Exception {

        String file = args[0];

        Fits f = new Fits(file);
        int i = 0;
        BasicHDU h;

        do {
            h = f.readHDU();
            if (h != null) {
                if (i == 0) {
                    System.out.println("\n\nPrimary header:\n");
                } else {
                    System.out.println("\n\nExtension " + i + ":\n");
                }
                i += 1;
                h.info();
            }
        } while (h != null);
        BufferedFile bf = new BufferedFile(args[1], "rw");
        f.write(bf);
        bf.close();

    }
}
