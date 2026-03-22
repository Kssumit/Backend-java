package public_private_default;

//Basics ///
/*
    1. public: different packages me bhi use kr skte hai
    2. protected: jo class extend krti hai uske andr bhi use kr skte hai but class ke bhr nhi 
    3. private: only inside class
    4. default: anywhere inside the same package

*/

//can constructor be private ?
// yes
//but why ?
// 1. if don't want to create object of  particular class
// 2. only want to create single object

public class School {
    private static School instance;

    private School(){}

    public static School getInstance(){
        if(instance == null) instance = new School();

        return instance;
    }
}

