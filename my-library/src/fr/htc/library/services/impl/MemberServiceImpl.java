package fr.htc.library.services.impl;

import java.util.List;

import fr.htc.library.dao.MemberDao;
import fr.htc.library.dao.impl.MemberDaoMapImpl;
import fr.htc.library.model.Member;
import fr.htc.library.services.MemberService;

public class MemberServiceImpl implements MemberService {
	MemberDao memberDao = new MemberDaoMapImpl();

	@Override
	public void createMember(String lastName, String firstName, int age) {

		if (age < 18) {
			System.err.println("You are not allowed to subscribe, must have at least 18 years old");
			return;
		}

		Member member = new Member(firstName, lastName, age);

		memberDao.save(member);

	}

	@Override
	public List<Member> getMemberList() {

		return memberDao.getAllMembers();
	}

	@Override
	public void deleteMemberByMatricule(String matricule) {
		memberDao.remove(matricule);
	}

	@Override
	public void deleteMember(Member Member) {
		// TODO Auto-generated method stub

	}

	@Override
	public Member findMemberByMatricule(String matricule) {
		
		if (matricule == null || matricule.isEmpty()) {
			System.out.println("matricul must be provided ");
			return null;
			
		}
		
		return memberDao.getMemberByMatricule(matricule);
		
	}

}
