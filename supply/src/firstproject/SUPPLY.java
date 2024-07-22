package firstproject;
import java.util.Scanner;

public class SUPPLY {
	private int Code;
    private String FoodName, Sticker, FoodType;
//    MEHTOD FOR GETTYPE OF THE FODD 
    public void GetType() 
    {
        switch (Sticker.toLowerCase()) 
        {
            case "green":
                FoodType = "Vegetarian";
                break;
            case "yellow":
                FoodType = "Contains Egg";
                break;
            case "red":
                FoodType = "Non Vegetarian";
                break;
            default:
                FoodType = "Unknown";
                break;
        }
    }
    
    public void FoodIn() 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Code: ");
        Code = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter FoodName: ");
        FoodName = sc.nextLine();

        System.out.print("Enter Sticker (Green/Yellow/Red): ");
        Sticker = sc.nextLine();

        GetType();
        sc.close();
    }
    
    public void FoodOut() {
        System.out.println("Code:     " + Code);
        System.out.println("FoodName: " + FoodName);
        System.out.println("Sticker:  " + Sticker);
        System.out.println("FoodType: " + FoodType);
    }
}
