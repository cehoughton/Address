
import java.util.ArrayList;


public class Contact {
  private static ArrayList<Contact> instances = new ArrayList<Contact>();

  private String mFirstName;
  private String mLastName;
  private String mBirthMonth;
  private int mId;

  public Contact (String firstName, String lastName,
  String birthMonth) {
    mFirstName = firstName;
    mLastName = lastName;
    mBirthMonth = birthMonth;
    instances.add(this);
    mId = instances.size();
  }

  public String getFirstName() {
    return mFirstName;
  }

  public String getLastName() {
    return mLastName;
  }

  public String getBirthMonth() {
    return mBirthMonth;
  }

  public int getId() {
    return mId;
  }
  public static void clear() {
     instances.clear();
   }


 }
