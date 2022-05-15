
public class Zahlomat
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int data[] = new int[25];

    public Zahlomat()
    {
        // Instanzvariable initialisieren
        for (int i = 0; i<data.length; i++) {
            data[i] = ((int)(Math.random()*10)+10);
        }
    }
    
    public Zahlomat(int[] data)
    {
        // Instanzvariable initialisieren
        this.data = data;
    }

    
    public int maximum () {
        
        int h=0;
        for (int i=0; i<data.length; i++) {
            if (data[i]>h) {
                h=data[i];
            }
        }
        return h;
    }
    
    public void sortieren () {
        int help = 0;
        int num;
        for (int i=0; i<15; i++) {
            for (int h = 0; h < data.length/2; h++) {
                //Minimum bestimmen
                num=8000;
                for (int f=h; f<data.length-h; f++) {
                    if (data[f]<num) {
                        num=data[f];
                        help=f;
                    }
                }
                data[help] = data[h];
                data[h] = num;
                System.out.println(num);
                
                //Maximum bestimmen
                num=0;
                for (int f=h; f<data.length-h; f++) {
                    if (data[f]>num) {
                        num=data[f];
                        help=f;
                    }
                }
                data[help] = data[data.length-h-1];
                data[data.length-h-1] = num;
                System.out.println(num);
            }
        }
        /*System.out.println("border");
        System.out.println("border");
        System.out.println("border");
        System.out.println("border");
        System.out.println("border");
        System.out.println("border");
        for (int i = 0; i<data.length; i++){
            System.out.println(data[i]);
        }*/
    }
    
    public int[] getSorted() {
        sortieren();
        return data;
    }
}
