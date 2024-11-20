import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lance lance = new Lance();

        System.out.println("LANCE CREATION");

        System.out.print("How many mechs are in your lance? ");
        int numMechs = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numMechs; i++){
            System.out.println("Enter mech details for mech " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Tonnage: ");
            int tonnage = scanner.nextInt();
            scanner.nextLine();

            Mech mech = new Mech(name, tonnage, 0);
            lance.addMech(mech);
        }

        System.out.println("\nEnter The Number Of The Mechs You Want To Attack With (Leave Space In Between Selection");

        String[] choices = scanner.nextLine().split(" ");

        List<Mech> selectedMechs = new ArrayList<>();

        for(String choice : choices) {
            try {
                int mechIndex = Integer.parseInt(choice.trim()) - 1 ;
                if (mechIndex >= 0 && mechIndex < lance.getMechs().size())  {
                    Mech selectedMech = lance.getMechs().get(mechIndex);
                    selectedMechs.add(selectedMech);
                } else {
                    System.out.println("Invaild Mech Number: " + choice);
                }
            } catch(NumberFormatException e) {
                System.out.println("Inviald Input: " + choice);
                }
        }

        System.out.println("\nThe Following Mechs Are Attacking:");
        for (Mech mech : selectedMechs) {
            mech.getInfo();
        }
        System.out.println("\nCalculation For Hit Dice");

        for(Mech mech : selectedMechs) {
            System.out.println("\nHow Many Targets Is Mech " + mech.getName() + " Attacking?");
            int numTargets = scanner.nextInt();


            for(int target = 1; target <= numTargets; target++) {
               System.out.println("\nEnter Variables For Target " + target + " of mech " + mech.getName() + ":");

               System.out.print("Movement Pips? ");
               int movement = scanner.nextInt();

               System.out.print("Enemy Movement Pips? ");
               int enemeyMovement = scanner.nextInt();

               System.out.print("Gunnery Skill? ");
               int gunSkill = scanner.nextInt();

               System.out.print("Terrain Modifier? ");
               int terrain = scanner.nextInt();

               System.out.print("Range Modifier? ");
               int range = scanner.nextInt();

               System.out.print("Other Modifiers? ");
               int other = scanner.nextInt();


                int attackRoll= Math_Logic.getAttackRoll(movement,enemeyMovement,gunSkill,terrain,range,other);


                System.out.println("For Target " + target + ", mech " + mech.getName() + " needs to roll: " + attackRoll);
            }
        }

        scanner.close();
    }



}
