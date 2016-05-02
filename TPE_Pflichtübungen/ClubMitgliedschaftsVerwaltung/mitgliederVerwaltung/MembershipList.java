package mitgliederVerwaltung;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Patricks-PC on 02.05.2016.
 */

@SuppressWarnings("serial")
public class MembershipList extends HashMap<Integer, Member> implements Map<Integer, Member>, Iterable<Member> {

	
	HashMap<Integer, Member> membershiplist;

    public MembershipList() {
        this.membershiplist = new HashMap<>();
    }

	public Member put(Member member){
        return put(member.getMitgliederid(), member);
    }
	

	
	@Override
	public Iterator<Member> iterator() {
		return new MembershipListIterator(this);
	}
	
}
