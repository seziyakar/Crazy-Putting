public class PhysicsEngine {
   private static final h = 0.1;
   private static final a = 0.1;
   
   private Terrain ter;
   private double x;
   private double y;
   private double vx;
   private double vy;
   
   public PhysicsEngine(Terrain ter) {
      this.ter = ter;
   }
   
   public ArrayList<double[]> getMotion(x, y, vx, vy, h) {
      this.x = x;
      this.y = y;
      this.vx = vx;
      this.vy = vy;
      
      ArrayList<double[]> motion = new ArrayList<double[]>();
      
      // generates the motion while the ball is roling
      while (Mat.sqrt(vx*vx + vy*vy) < a) {
         double[] nextCoordinates = getNextCoordinates();
         motion.add(nextCoordinates);
      }
      
      // generates the motion of the ball rolling down hill
      boolean isMoving = true;
      while (isMoving) {
         double[] nextCoordinates = getNextStaticCoordinates();
         if (nextCoordinates == null) {
            isMoving = false;
         }
         else {
            motion.add(nextCoordinates);
         }
      }
      
      return motion;
   }
   
   private double[] getNextCoordinates() {
      double slopeX = ter.getSlopeX(x, y);
      double slopeY = ter.getSlopeY(x, y);
      double friction = ter.getFriction(x, y);
      
      // Do calculations
   }
   
   private double[] getNextStaticCoordinates() {
      double slopeX = ter.getSlopeX(x, y);
      double slopeY = ter.getSlopeY(x, y);
      double friction = ter.getStaticFriction(x, y);
      
      // Do calculations
      // returns null if the ball is not moving
   }
}