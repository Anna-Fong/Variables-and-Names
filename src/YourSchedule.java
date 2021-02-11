public class YourSchedule
{
    public static void main( String[] args )
    {

        // Use several variables to store the names of your classes and their teachers.
        // Then, display a nice little table displaying your schedule.
        // Just FYI, my column of courses has a width of 26 characters, and the teacher column has a width of 15.
        // The first and last lines are a plus sign, fifty dashes (a.k.a. minus signs) and another plus sign.

        String table_name = "My Schedule";
        String block1 = "1-2";
        String block2 = "1-2";
        String block3 = "1-3";
        String block4 = "1-4";
        String block5 = "2-1";
        String block6 = "2-2";
        String block7 = "2-3";
        String block8 = "2-4";

        String classname_1 = "Marketing and Promotion 11";
        String classname_2 = "French 11";
        String classname_3 = "English Composition 11";
        String classname_4 = "Computer Programming 11";
        String classname_5 = "Chemistry 11";
        String classname_6 = "Physics 11";
        String classname_7 = "Pre-Calculus 11";
        String classname_8 = "Geography";

        String teacher_1 = "Ms. Young";
        String teacher_2 = "Ms. Hollett";
        String teacher_3 = "Mr. Tryssenaar";
        String teacher_4 = "Mr. Zaremba";
        String teacher_5 = "Ms. Ogden";
        String teacher_6 = "Mr. Jung";
        String teacher_7 = "Ms. Lidder";
        String teacher_8 = "Ms. Clutchey";

        String dash = "-";
        String dashrepeated = dash.repeat(57);

        System.out.println("+" + dashrepeated + "+");
        System.out.println("|  " + table_name + "                                            |");
        System.out.println("+" + dashrepeated + "+");
        System.out.println("|  " + block1 + "  |  " + classname_1 + "  |  " + teacher_1 + "       |");
        System.out.println("|  " + block2 + "  |  " + classname_2 + "                   |  " + teacher_2 + "     |");
        System.out.println("|  " + block3 + "  |  " + classname_3 + "      |  " + teacher_3 + "  |");
        System.out.println("|  " + block4 + "  |  " + classname_4 + "     |  " + teacher_4 + "     |");
        System.out.println("|  " + block5 + "  |  " + classname_5 + "                |  " + teacher_5 + "       |");
        System.out.println("|  " + block6 + "  |  " + classname_6 + "                  |  " + teacher_6 + "        |");
        System.out.println("|  " + block7 + "  |  " + classname_7 + "             |  " + teacher_7 + "      |");
        System.out.println("|  " + block8 + "  |  " + classname_8 + "                   |  " + teacher_8 + "    |");
        System.out.println("+" + dashrepeated + "+");


    }
}
