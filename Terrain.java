public class Terrain {
   private static final double minHeight = -10.0;
   private static final double maxHeight = 10.0;
   private static final double maxSlope = 0.15; //in absolute terms
   private static final double maxDerivativeSlope = 0.1; // in absolute terms and might need a better name
   private static final double m = 0.0459;
   private static final double g = 9.81;
   private static final double minKineticFrictionGrass = 0.05;
   private static final double maxKineticFrictionGrass = 0.1;
   private static final double minStaticFrictionGrass = 0.1;
   private static final double maxStaticFrictionGrass = 0.2;
   private static final double maxSpeed = 5.0;
   private static final double minRadius = 0.05;
   private static final double maxRadius = 0.15;
   
   
   public double getSlopeX(double x, double y) {
      
   }
   
   public double getSlopeY(double x, double y) {
      
   }
   
   public double getFriction(double x, double y) {
      
   }
   
   public double getStaticFriction(double x, double y) {
      
   }
   
   public boolean goal(double x, double x) {
      
   }
}