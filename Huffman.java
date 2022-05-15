
public class Huffman
{
    String text;
    Element[] letter = new Element [25];
    
    BinTree hufTree = new BinTree<String>();
    
    public Huffman()
    {
        text = "test";
        letter = Haeufigkeitsanalyse(text);
    }
    
    public Huffman(String text)
    {
        this.text = text;
        letter = Haeufigkeitsanalyse(text);
    }
    
    public void create () {
        
    }
    
    public Element[] Haeufigkeitsanalyse (String word) { //ELEPHANTENJAGDVEREIN
        Element[] let = new Element[25];
        let[0] = new Element(Character.toString(word.charAt(0)));
        let[0].setNum(1);
        
        for (int i = 1; i < word.length(); i++) {
            for(int f=0; f<let.length; f++) {
                if (let[f] == null) {
                    let[f] = new Element(Character.toString(word.charAt(i)));
                    let[f].setNum(1);
                    break;
                }
                else if(Character.toString(word.charAt(i)).equals((let[f].getName()))) {
                    //int num = Integer.parseInt(let[f][1]);
                    //num++;
                    //System.out.println(let[f][0]);
                    let[f].setNum((let[f].getNum())+1);
                    break;
                }
            }
        }
        
        return let;
    }
    
    public void sortieren () { //Umschreiben dass er Element sortiert!! 
        int[] data = new int [25];
        
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
    
}
