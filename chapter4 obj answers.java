Find the error in each of the following code segments, and explain how to correct it: 
a) i = 1 while (i <= 10) ; ++1; } 

Answer
int i = 1; // Declare i as an int
while (i <= 10) {
    ++i; // Correctly increment i
}

b) for ( k = 0.1 ; (k)! = 1 k += 0.1) System.out.println(k); 

Answer

for (int i = 1; i <= 10; i++) {
    double k = i * 0.1;
    System.out.println(k);
}

c) switch (n) { case 1: System.out.println("The number is 1"); 
		case 2: System.out.println("The number is 2"); 
			break; default: System.out.println("The number is not 1 or 2"); 
				break; } 

Answer

switch (n) {
    case 1:
        System.out.println("The number is 1");
    case 2: // Error: Missing break statement
        System.out.println("The number is 2");
        break;
    default:
        System.out.println("The number is not 1 or 2");
        break;
}

d) The following code should print the values 1 to 10: n = 1 while (n < 10) System.out.println(n++);

Answer

int n = 1; // Declare n as an int
while (n <= 10) {
    System.out.println(n);
    n++;
}