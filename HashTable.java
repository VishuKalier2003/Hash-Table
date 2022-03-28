/*Properties and UIDefaults extends to HashTable which further extends to Dictionaries, created as a Class.
The HashTable implements HaspMap, it is serializable and cloneable.*/
import java.util.*;
class HashTable
{
    public static void main(String args[])
    {  // Initialization of HashTable of type Integer Key mapping to String value
        Hashtable<Integer, String> Ht = new Hashtable<Integer, String>();  // Creating a Hash table of Integer mapped with Strings
        Scanner sc = new Scanner(System.in);  // Scanner IO object creation
        int s, x;
        System.out.print("Enter how many mappings to create : ");
        s = sc.nextInt();
        String str;
        for(int i = 0; i < s; i++)
        {
            System.out.print("Enter the Key : ");
            x = sc.nextInt();
            System.out.println();
            System.out.print("Enter the Value corresponding to the Key : ");
            System.out.println();
            str = sc.next();
            Ht.put(x, str);   // Put method to map Key to its Corresponding value
        }
        Ht.remove(10);  // Removal can be done by keys
        Ht.remove(50, "name");   // Removal can be done by both key-value pairs
        System.out.println("Mappings of HashTable is : "+Ht);
        sc.close();
    }
}