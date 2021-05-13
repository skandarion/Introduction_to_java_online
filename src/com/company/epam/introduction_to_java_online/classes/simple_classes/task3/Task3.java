package com.company.epam.introduction_to_java_online.classes.simple_classes.task3;

public class Task3 {
    Student[] studentArray = new Student[10];
    public Task3() {
        studentArray[0] = new Student("Ivanov", "A.V.", "ME - 11", new int[]{7, 9, 6, 5, 8});
        studentArray[1] = new Student("Smirnov", "F.A.", "GU - 11", new int[]{9, 9, 10, 10, 9});
        studentArray[2] = new Student("Sidorov", "P.A.", "GU - 12", new int[]{7, 9, 6, 5, 8});
        studentArray[3] = new Student("Petrov", "R.T.", "GU - 12", new int[]{7, 9, 6, 5, 8});
        studentArray[4] = new Student("Aleksandrov", "K.L.", "ME - 11", new int[]{7, 9, 6, 5, 8});
        studentArray[5] = new Student("Jamal", "L.K.", "ME - 12", new int[]{7, 9, 6, 5, 8});
        studentArray[6] = new Student("Smith", "J.O.", "ME - 12", new int[]{9, 9, 9, 9, 9});
        studentArray[7] = new Student("Black", "R.G.", "ME - 11", new int[]{7, 9, 6, 5, 8});
        studentArray[8] = new Student("Trump", "D.F.", "GU - 11", new int[]{10, 10, 10, 10, 10});
        studentArray[9] = new Student("Obama", "B.F.", "GU - 12", new int[]{7, 9, 6, 5, 8});
    }
    public void printExcellents(){
        for(Student student: studentArray){
            if(isTenAndNine(student.grades)){
                student.printInfo();
            }
        }
    }

    public boolean isTenAndNine(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 10 || arr[i] == 9){
            }
            else {
                return false;
            }
        }
        return true;
    }
}
