package batallaRobots;

public class BatallaRobots { 
    public static void main(String[] args) { 
        int energiaRobotA = 100; 
        int energiaRobotB = 100; 
 
        System.out.println("🤖 Bienvenido a la Batalla de Robots 🤖"); 
        System.out.println("Robot A vs Robot B\n"); 
 
        while (energiaRobotA > 0 && energiaRobotB > 0) { 
            int golpeA = (int)(Math.random() * 20) + 1; 
            int golpeB = (int)(Math.random() * 20) + 1; 
 
            energiaRobotA -= golpeB; 
            energiaRobotB -= golpeA; 
 
            System.out.println("Robot A golpea con " + golpeA + " puntos."); 
            System.out.println("Robot B golpea con " + golpeB + " puntos."); 
            System.out.println("Energía A: " + energiaRobotA + " | Energía B: " + energiaRobotB + "\n"); 
        } 
 
        if (energiaRobotA > energiaRobotB) { 
            System.out.println("🏆 ¡Robot A gana la batalla!"); 
        } else if (energiaRobotB > energiaRobotA) { 
            System.out.println("🏆 ¡Robot B gana la batalla!"); 
        } else { 
            System.out.println("🤝 ¡Empate!"); 
        } 
    } 
} 