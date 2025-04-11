package Lessons.Lesson10.Abstraction;
import java.util.UUID;

public abstract class Identification {
 protected UniqueID uniqueID = new UniqueID();

  protected static class UniqueID{
  private final UUID uuid = UUID.randomUUID();
     public String getUniqueCode() {
        return "RO12BANK-" + uuid.toString().replace("-","").substring(0,4).toUpperCase();
    }
  }
}
