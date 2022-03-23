package MasterJava.vocabulary.Keywords;

// Uncomment to see


public class thisKeyword {
    public int x = 0;
    public int y = 0;

    //Constructor

    // public thisKeyword(int a, int b) {
    //     x = a;
    //     y = b;
    // }



    // Or rewrite it using the "this.var" keyword
    public thisKeyword(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    
    // the this. keyword can beb used im many ways


    // Example

    public class Rectangle {
        private int x, y;
        private int width, height;
            
        public Rectangle() {
            this(0, 0, 1, 1);
        }
        public Rectangle(int width, int height) {
            this(0, 0, width, height);
        }
        public Rectangle(int x, int y, int width, int height) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
        }
        
    }
}
