import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

// ANNOTATION HIBERNATE ##########################################

//@Entity (name="USER_DETAILS")
/* It will create a new TABLE with this name and put the data there. */
//...
@Entity (name="USER_DETAILS")
public class UserDetails {
//...
	
// *****************************************************
//@Id
/* It will define the primary key of the TABLE */
//...
@Id
private double userId;
//...

//*****************************************************
//@Annotation
/* WHERE TO PUT IT:
 - ATTRIBUTE: it will get the value of the attribute
 - GETTER: it will get the value of the getter (can be different) 
*/
//...

//*****************************************************
//@Annotation
/* @Transiant
   - the name is not added to the statement (not persistent)
   ex: static field that is the same for all classes (don�t need to see the column)
*/
//...

//*****************************************************
//@Temporal
/* Show only a part of the date */
//...
@Temporal (TemporalType.DATE)
public Date getJoinedDate() {
	return joinedDate;
}
//...

//*****************************************************
//@Lob
/* Large Object */


