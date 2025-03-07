|  | Algorithm and Data Structure | 
|--|--|
| NIM | 244107020140 |
| NAME | Muhammad Rizki |
| CLASS | TI - 1I |
| REPO | [link] (https://github.com/emrizky1/2ndSemester) |

# JOBSHEET 2 Object

## 2.1.2 Verification of Experiment Result

![ Screenshot ](img/1.png)

## 2.1.3 Questions

**Answers**
1. Characteristic of Object: Has something (Data, property, Variable, etc), can do something (Behaviour, function, method), specific.
Characterictic of Class: General.
2. It has 4 attributes: String studentID, String name, String className, double gpa.
3. It has 4 methods: print, changeClass, updateGPA, evaluate.
4. Add if statement to check if ipk > 4 / ipk < 0. Also add an error statement when it is out of range.
5. The program uses the gpa score to evaluates student performances. The program will return String value and the result will be depend on the student's gpa score.

## 2.2.2 Verification of Experiment Result

![ Screenshot ](img/2.png)

## 2.2.3 Questions

**Answers**
1. Student20 student1 = new Student20();. The name of the created object is student1
2. To access attributes of an object is by typing objectName.attributeName.
To acces methods of an object is by typing objectName.methodName(). You can input the parameters if needed.
3. It's because after the first print, the program calls student1.changeClass and student1.updateGPA which those methods are for updating the class and the gpa to the current value. Therefore, the output of the first print and the second print are different.

## 2.3.2 Verification of Experiment Result

![ Screenshot ](img/3.png)

## 2.3.3 Questions

**Answer**
1. public Student20(String id, String name, String cls, double gpa)
2. The following line are for calling constructor on instantiation using parametric.
3. The program will show an error because the student1 is not using parametric for instantiation and since the default constructor has been deleted, the student1 need to use the parametric one.
4. No, we can call methods in any order that we want. But, if it has any dependencies between one method to another, then we need to make sure that it is called in the right order.
5. The screenshot of the code and the result are below:
![ Screenshot ](img/5.png)
![ Screenshot ](img/4.png)

## Assignment 1

The solution is implemented in Course20.java and CourseMain and below is the screenshot of the result.

![ Screenshot ](img/6.png)

**Brief Explanation**
1. Make course20.java for class
2. Inside course20.java, make attributes and methods design for object that we want to make.
3. Make another file named CourseMain.java for making the object.
4. inside CourseMain.java, there are 2 ways to make an object.
5. The first one is making an object using standart constructor (constructor without any parameter) by input Course20.objectName = new Course20(). But, we need to input the details like in the screenshot below
6. The second one is making an object using constructor with parameter by input Course20.objectName = new Course20(parameter).
7. If we want to call any methods in the class, we need to input objectName.methodsName()

**Screenshot**
1. ![ Screenshot ](img/7.png)
2. ![ Screenshot ](img/8.png)

## Assignment 2

The solution is implemented in Lecturer20.java and LecturerMain and below is the screenshot of the result.

![ Screenshot ](img/9.png)

**Brief Explanation**
1. Make Lecturer20.java for class
2. Inside Lecturer20.java, make attributes and methods design for object that we want to make.
3. Make another file named LecturerMain.java for making the object.
4. inside LecturerMain.java, there are 2 ways to make an object.
5. The first one is making an object using standart constructor (constructor without any parameter) by input Lecturer20.objectName = new Lecturer20(). But, we need to input the details like in the screenshot below
6. The second one is making an object using constructor with parameter by input Lecturer20.objectName = new Lecturer20(parameter).
7. If we want to call any methods in the class, we need to input objectName.methodsName()

**Screenshot**
1. ![ Screenshot ](img/10.png)
2. ![ Screenshot ](img/11.png)