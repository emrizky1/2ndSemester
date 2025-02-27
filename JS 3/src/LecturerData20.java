public class LecturerData20 {
    void showLecturerData(Lecturer20[] LecturerArray) {
        for (Lecturer20 Lecturer : LecturerArray) {
            System.out.println("============================================");
            System.out.println("ID: " + Lecturer.id);
            System.out.println("Name: " + Lecturer.nama);
            System.out.println("Age: " + Lecturer.usia);
            if (Lecturer.jk) {
                System.out.println("Gender: Male");
            } else {
                System.out.println("Gender: Female");
            }
        }
    }

    void countLecturerByGender(Lecturer20[] LecturerArray) {
        int male = 0;
        int female = 0;
        for (Lecturer20 Lecturer : LecturerArray) {
            if (Lecturer.jk) {
                male++;
            } else {
                female++;
            }
        }
        System.out.println("============================================");
        System.out.println("Male Lecturer quan: " + male);
        System.out.println("Female Lecturer quan: " + female);
    }

    void averageLecturerAgeByGender(Lecturer20[] LecturerArray) {
        int male = 0;
        int female = 0;
        int maleAge = 0;
        int femaleAge = 0;
        for (Lecturer20 Lecturer : LecturerArray) {
            if (Lecturer.jk) {
                male++;
                maleAge += Lecturer.usia;
            } else {
                female++;
                femaleAge += Lecturer.usia;
            }
        }
        double avgM = (double) maleAge / male;
        double avgFM = (double) femaleAge / female;

        System.out.println("============================================");
        System.out.println("Average Lecturer Age by Gender (male): " + avgM);
        System.out.println("Average Lecturer Age by Gender (female): " + avgFM);

    }

    void showOldestLecturerInfo(Lecturer20[] LecturerArray) {
        Lecturer20 oldest = LecturerArray[0];
        for (Lecturer20 Lecturer : LecturerArray) {
            if (Lecturer.usia > oldest.usia ) {
                oldest.usia = Lecturer.usia;
            }
        }
        System.out.println("============================================");
        System.out.println("Oldest Lecturer: " + oldest.usia);
    }

    void showYoungestLecturerInfo(Lecturer20[] LecturerArray) {
        Lecturer20 youngest = LecturerArray[0];
        for (Lecturer20 Lecturer : LecturerArray) {
            if (Lecturer.usia < youngest.usia) {
                youngest.usia = Lecturer.usia;
            }
        }
        System.out.println("============================================");
        System.out.println("Youngest Lecturer: " + youngest.usia);
    }
}
