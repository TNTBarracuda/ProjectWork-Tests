import java.io.IOException;

public class te$ter {
    public static void main(String[]args) throws InterruptedException{
        Master master = new Master();
        LootGenerator loot1 = new LootGenerator(44, 'w');
//        System.out.println(loot1.returnInfo());
        System.out.println((master.Extra("Bold", 'B')));
        System.out.println((master.Cyan("Underline", 'U')));

        System.out.println();

        //EXTRA
            System.out.println(master.Extra_Background(false, master.Red(   "Extra, Normal/Red")));
            System.out.println(master.Extra_Background(false, master.Blue(  "Extra, Normal/Blue")));
            System.out.println(master.Extra_Background(false, master.Yellow("Extra, Normal/Yellow")));
            System.out.println(master.Extra_Background(false, master.Green("Extra, Normal/Green")));
            System.out.println(master.Extra_Background(false, master.Purple("Extra, Normal/Purple")));
            System.out.println(master.Extra_Background(false, master.Cyan(  "Extra, Normal/Cyan")));

            System.out.println(master.Extra_Background(true, master.Red(    "Extra, Bright/Red")));
            System.out.println(master.Extra_Background(true, master.Blue(   "Extra, Bright/Blue")));
            System.out.println(master.Extra_Background(true, master.Yellow( "Extra, Bright/Yellow")));
            System.out.println(master.Extra_Background(true, master.Green(  "Extra, Bright/Green")));
            System.out.println(master.Extra_Background(true, master.Purple( "Extra, Bright/Purple")));
            System.out.println(master.Extra_Background(true, master.Cyan(   "Extra, Bright/Cyan")));

        //RED
            System.out.println(master.Red_Background(false, master.Red(     "Red, Normal/Red")));
            System.out.println(master.Red_Background(false, master.Blue(    "Red, Normal/Blue")));
            System.out.println(master.Red_Background(false, master.Yellow(  "Red, Normal/Yellow")));
            System.out.println(master.Red_Background(false, master.Green(   "Red, Normal/Green")));
            System.out.println(master.Red_Background(false, master.Purple(  "Red, Normal/Purple")));
            System.out.println(master.Red_Background(false, master.Cyan(    "Red, Normal/Cyan")));

            System.out.println(master.Red_Background(true, master.Red(      "Red, Bright/Red")));
            System.out.println(master.Red_Background(true, master.Blue(     "Red, Bright/Blue")));
            System.out.println(master.Red_Background(true, master.Yellow(   "Red, Bright/Yellow")));
            System.out.println(master.Red_Background(true, master.Green(    "Red, Bright/Green")));
            System.out.println(master.Red_Background(true, master.Purple(   "Red, Bright/Purple")));
            System.out.println(master.Red_Background(true, master.Cyan(     "Red, Bright/Cyan")));

        //BLUE
            System.out.println(master.Blue_Background(false, master.Red(    "Blue, Normal/Red")));
            System.out.println(master.Blue_Background(false, master.Blue(   "Blue, Normal/Blue")));
            System.out.println(master.Blue_Background(false, master.Yellow( "Blue, Normal/Yellow")));
            System.out.println(master.Blue_Background(false, master.Green(  "Blue, Normal/Green")));
            System.out.println(master.Blue_Background(false, master.Purple( "Blue, Normal/Purple")));
            System.out.println(master.Blue_Background(false, master.Cyan(   "Blue, Normal/Cyan")));

            System.out.println(master.Blue_Background(true, master.Red(     "Blue, Bright/Red")));
            System.out.println(master.Blue_Background(true, master.Blue(    "Blue, Bright/Blue")));
            System.out.println(master.Blue_Background(true, master.Yellow(  "Blue, Bright/Yellow")));
            System.out.println(master.Blue_Background(true, master.Green(   "Blue, Bright/Green")));
            System.out.println(master.Blue_Background(true, master.Purple(  "Blue, Bright/Purple")));
            System.out.println(master.Blue_Background(true, master.Cyan(    "Blue, Bright/Cyan")));


        System.out.println(master.Yellow_Background(false, master.Red(      "Yellow, Normal/Red")));
        System.out.println(master.Yellow_Background(false, master.Blue(     "Yellow, Normal/Blue")));
        System.out.println(master.Yellow_Background(false, master.Yellow(   "Yellow, Normal/Yellow")));
        System.out.println(master.Yellow_Background(false, master.Green(    "Yellow, Normal/Green")));
        System.out.println(master.Yellow_Background(false, master.Purple(   "Yellow, Normal/Purple")));
        System.out.println(master.Yellow_Background(false, master.Cyan(     "Yellow, Normal/Cyan")));

        System.out.println(master.Yellow_Background(true, master.Red(       "Yellow, Bright/Red")));
        System.out.println(master.Yellow_Background(true, master.Blue(      "Yellow, Bright/Blue")));
        System.out.println(master.Yellow_Background(true, master.Yellow(    "Yellow, Bright/Yellow")));
        System.out.println(master.Yellow_Background(true, master.Green(     "Yellow, Bright/Green")));
        System.out.println(master.Yellow_Background(true, master.Purple(    "Yellow, Bright/Purple")));
        System.out.println(master.Yellow_Background(true, master.Cyan(      "Yellow, Bright/Cyan")));


        System.out.println(master.Green_Background(false, master.Red(       "Green, Normal/Red")));
        System.out.println(master.Green_Background(false, master.Blue(      "Green, Normal/Blue")));
        System.out.println(master.Green_Background(false, master.Yellow(    "Green, Normal/Yellow")));
        System.out.println(master.Green_Background(false, master.Green(     "Green, Normal/Green")));
        System.out.println(master.Green_Background(false, master.Purple(    "Green, Normal/Purple")));
        System.out.println(master.Green_Background(false, master.Cyan(      "Green, Normal/Cyan")));

        System.out.println(master.Green_Background(true, master.Red(        "Green, Bright/Red")));
        System.out.println(master.Green_Background(true, master.Blue(       "Green, Bright/Blue")));
        System.out.println(master.Green_Background(true, master.Yellow(     "Green, Bright/Yellow")));
        System.out.println(master.Green_Background(true, master.Green(      "Green, Bright/Green")));
        System.out.println(master.Green_Background(true, master.Purple(     "Green, Bright/Purple")));
        System.out.println(master.Green_Background(true, master.Cyan(       "Green, Bright/Cyan")));


        System.out.println(master.Purple_Background(false, master.Red(      "Purple, Normal/Red")));
        System.out.println(master.Purple_Background(false, master.Blue(     "Purple, Normal/Blue")));
        System.out.println(master.Purple_Background(false, master.Yellow(   "Purple, Normal/Yellow")));
        System.out.println(master.Purple_Background(false, master.Green(    "Purple, Normal/Green")));
        System.out.println(master.Purple_Background(false, master.Purple(   "Purple, Normal/Purple")));
        System.out.println(master.Purple_Background(false, master.Cyan(     "Purple, Normal/Cyan")));

        System.out.println(master.Purple_Background(true, master.Red(       "Purple, Bright/Red")));
        System.out.println(master.Purple_Background(true, master.Blue(      "Purple, Bright/Blue")));
        System.out.println(master.Purple_Background(true, master.Yellow(    "Purple, Bright/Yellow")));
        System.out.println(master.Purple_Background(true, master.Green(     "Purple, Bright/Green")));
        System.out.println(master.Purple_Background(true, master.Purple(    "Purple, Bright/Purple")));
        System.out.println(master.Purple_Background(true, master.Cyan(      "Purple, Bright/Cyan")));


        System.out.println(master.Cyan_Background(false, master.Red(        "Cyan, Normal/Red")));
        System.out.println(master.Cyan_Background(false, master.Blue(       "Cyan, Normal/Blue")));
        System.out.println(master.Cyan_Background(false, master.Yellow(     "Cyan, Normal/Yellow")));
        System.out.println(master.Cyan_Background(false, master.Green(      "Cyan, Normal/Green")));
        System.out.println(master.Cyan_Background(false, master.Purple(     "Cyan, Normal/Purple")));
        System.out.println(master.Cyan_Background(false, master.Cyan(       "Cyan, Normal/Cyan")));

        System.out.println(master.Cyan_Background(true, master.Red(         "Cyan, Bright/Red")));
        System.out.println(master.Cyan_Background(true, master.Blue(        "Cyan, Bright/Blue")));
        System.out.println(master.Cyan_Background(true, master.Yellow(      "Cyan, Bright/Yellow")));
        System.out.println(master.Cyan_Background(true, master.Green(       "Cyan, Bright/Green")));
        System.out.println(master.Cyan_Background(true, master.Purple(      "Cyan, Bright/Purple")));
        System.out.println(master.Cyan_Background(true, master.Cyan(        "Cyan, Bright/Cyan")));

        System.out.println();

        System.out.println(master.Default("Default ") + master.Extra("Extra ") + master.Red("Red ")
        + master.Blue("Blue ") + master.Yellow("Yellow ") + master.Green("Green ")
                + master.Purple("Purple ") + master.Cyan("Cyan "));
//        for(int i = 0; i<5; i++) {
//            System.out.println(master.Random(0.2, 0.7, i));
//            //Thread.sleep(500);
//        }
        for(int i = 1; i<=10; i++) {
            Thread.sleep(300);
            System.out.print("\r"+i);       // "\r" resets the line
        }
        System.out.println ();
        for(int i = 1; i<=10; i++) {
            Thread.sleep(150);
            System.out.print("\r"+i);       // "\r" resets the line
        }
    }
}
