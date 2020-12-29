/* Description: House class containing the attributes and constructor methods needed to construct a house object, the getter and setter methods to get and set new values
 * to the attributes, a draw method to printout what the house looks like, perimeter and area methods to calculate those values for the house, grow and shrink methods to
 * grow and shrink the house by 1 value each time they are called, and a summary method to provide attributes, area and perimeter values, and draw the house all in one method.  
 * Author: Jeremy Reinert
 * Date: 3/6/19
 * Version: 1.0
 */
public class House {
	
	// Attribute/variable Declaration
	private int size;
	private char borderCharacter;
	private char interiorCharacter;
	
	
	/*
	 * Constructor Methods
	 */
	public House() {
		size = 3;
		borderCharacter = '*';
		interiorCharacter = '+';
	}
	
	public House(int size, char borderCharacter, char interiorCharacter) {
		
		// Validate size using validateSize method and set attribute value to int returned from the method
		this.size = validateSize(size);
		
		// Validate borderCharacter using validateBorderChar method and set attribute value to char returned from the method
		this.borderCharacter = validateBorderChar(borderCharacter);
		
		// Validate interiorCharacter using validateInteriorChar method and set attribute value to char returned from the method
		this.interiorCharacter = validateInteriorChar(interiorCharacter);	
	}
	
	/*
	 * Validation Methods
	 */
	
	// Size validation method to determine if size attribute is between 3 and 30 (inclusive) and if not, set the size value to 3 or 30
	private int validateSize(int size) {
		// Local Variable
		int returnSize = 0;
		
		if(size >= 3 && size <= 30) {
			returnSize = size;
		}
		// Check if size parameter is less than 3 and if so, set size attribute equal to 3
		else if(size < 3) {
			returnSize = 3;
		}
		// Check if size parameter is greater than 30 and if so, set size attribute equal to 30
		else if(size > 30) {
			returnSize = 30;
		}
		
		return returnSize;
	}
	
	// Border character validation method to determine if borderCharacter ASCII value is between 33 and 126 (inclusive) and if not, set the value to 33 or 126
	private char validateBorderChar(char borderCharacter) {
		// Local Variable
		char returnChar = ' ';
		
		// Check if borderCharacter is between ASCII characters 33 and 126
		if(borderCharacter >= (char)33 && borderCharacter <= (char)126) {
			returnChar = borderCharacter;
		}
		// Check if borderCharacter is less than ASCII character 33 and if so, set borderCharacter to ASCII 33
		else if(borderCharacter < (char)33) {
			System.out.println(borderCharacter + " is an illegel character. Setting the character to " + (char)33);
			returnChar = (char)33;
		}
		// Check if borderCharacter is greater than ASCII character 126 and if so, set borderCharacter to ASCII 126
		else if(borderCharacter > (char)126) {
			System.out.println(borderCharacter + " is an illegel character. Setting the character to " + (char)126);
			returnChar = (char)126;
		}
		
		return returnChar;
	}
	
	// Interior character validation method to determine if interiorCharacter ASCII value is between 33 and 126 (inclusive) and if not, set the value to 33 or 126
	private char validateInteriorChar(char interiorCharacter) {
		// Local Variable
		char returnChar = ' ';
		
		// Check if interiorCharacter is between ASCII characters 33 and 126
		if(interiorCharacter >= (char)33 && interiorCharacter <= (char)126) {
			returnChar = interiorCharacter;
		}
		// Check if interiorCharacter is less than ASCII character 33 and if so, set interiorCharacter to ASCII 33
		else if(interiorCharacter < (char)33) {
			System.out.println(interiorCharacter + " is an illegel character. Setting the character to " + (char)34);
			returnChar = (char)34;
		}
		// Check if interiorCharacter is greater than ASCII character 126 and if so, set interiorCharacter to ASCII 126
		else if(interiorCharacter > (char)126) {
			System.out.println(interiorCharacter + " is an illegel character. Setting the character to " + (char)125);
			returnChar = (char)125;
		}
		
		return returnChar;
	}
	
	/*
	 * Accessor Methods
	 */
	
	// Getter method for the size attribute
	public int getSize() {
		return size;
	}
	
	// Getter method for the borderCharacter attribute
	public char getBorderCharacter() {
		return borderCharacter;
	}
	
	// Getter method for the interiorCharacter attribute
	public char getInteriorCharacter() {
		return interiorCharacter;
	}
	
	/*
	 * Accessor/Mutator Methods
	 */
	
	// Setter method for the size attribute
	public void setSize(int size) {
		// Validate size using validateSize method and set attribute value to int returned from the method
		this.size = validateSize(size);
	}
	
	// Setter method for the borderCharacter attribute
	public void setBorder(char borderCharacter) {
		// Validate borderCharacter using validateBorderChar method and set attribute value to char returned from the method
		this.borderCharacter = validateBorderChar(borderCharacter);
	}
	
	// Setter method for the interiorCharacter attribute
	public void setFill(char interiorCharacter) {
		// Validate interiorCharacter using validateInteriorChar method and set attribute value to char returned from the method
		this.interiorCharacter = validateInteriorChar(interiorCharacter);
	}
	
	// Grow method to grow the base size of the house by 1 until size equals 30
	public void Grow() {
		// Increment size by 1
		size++;
		
		// Check if size is greater than 30 and set size to 30 if true
		if(size > 30) {
			size = 30;
		}
	}
	
	// Shrink method to shrink the base size of the house by 1 until size equals 3
	public void Shrink() {
		// Decrement size by 1
		size--;
		
		if(size < 3) {
			size = 3;
		}
	}
	
	// Perimeter method to return the perimeter of the house to the class/method calling it
	public double Perimeter() {
		// Local variable declaration
		int baseSideLength = size;
		int triangleSideLength = size + 2;
		double perimeter;
		
		perimeter = (3 * baseSideLength) + (2 * triangleSideLength) + 2;
		// Return perimeter to class/method calling it
		return perimeter;
	}
	
	// Area method to return the area of the house to the class/method calling it
	public double Area() {
		// Local variable declaration
		int baseSideLength = size;
		int triangleSideLength = size + 2;
		double area;
		
		area = ((Math.sqrt(3) / 4) * Math.pow(triangleSideLength, 2) + (Math.pow(baseSideLength, 2)));
		// Return area to class/method calling it
		return area;
	}
	
	// Draw method to print out house in the class calling the method
	public void Draw() {
		// Local variable declaration
		int baseSideLength = size;
		int triangleSideLength = size + 2;
		
		// For loop to print triangle/roof of house
		for(int i = 0; i <= triangleSideLength - 1; i++) {
			
			// Loop to determine number of spaces to print before printing borderCharacter
			for(int j = 1; j <= triangleSideLength - i; j++)
				System.out.print(" ");
				
			// Loop to determine which character -- borderCharacter or interiorCharacter -- to print
			for(int k = 1; k <= i; k++) {
				// Print borderCharacter if k == 1 or i, else print interiorCharacter
				if(k == 1  || k == i)
					System.out.print(borderCharacter + " ");
				else
					System.out.print(interiorCharacter + " ");
			}
				
			// Print line
			System.out.print("\n");
		}
		
		// For loop to print last line of triangle
		for(int i = 1; i <= triangleSideLength; i++) {
			if(i == 1 || i == 2 || i == triangleSideLength - 1 || i == triangleSideLength)
				System.out.print(borderCharacter + " ");
			else
				System.out.print(interiorCharacter + " ");
		}
		
		// Print line
		System.out.print("\n");
		
		// For loop to print square/base of house
		for(int i = 1; i <= baseSideLength - 2; i++) {
			
			// Print space before exteriorCharacter
			System.out.print("  ");
				
			// Loop to determine which character -- borderCharacter or interiorCharacter -- to print
			for(int k = 1; k <= baseSideLength; k++) {
				// Print borderCharacter if k == 1 or i, else print interiorCharacter
				if(k == 1 || k == baseSideLength)
					System.out.print(borderCharacter + " ");
				else
					System.out.print(interiorCharacter + " ");
			}
				
			// Print line
			System.out.print("\n");
		}
		
		// Print spaces before last line of border characters
		System.out.print("  ");
		
		// Loop to print correct number of border characters
		for(int j = 1; j <= baseSideLength; j++) {
		 System.out.print(borderCharacter + " ");
		}
		
		System.out.print("\n");
	}
	
	// Summary method to print out attributes, area, perimeter, and visual of house
	public void Summary() {
		System.out.println("Base Width = " + size + " units");
		System.out.println("Perimeter of house = " + Perimeter() + " units");
		System.out.println("Area of house = " + Area() + " units");
		System.out.println("The house looks like: ");
		Draw();
	}
	
}
