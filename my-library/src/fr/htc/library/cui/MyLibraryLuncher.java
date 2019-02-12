package fr.htc.library.cui;

import fr.htc.library.model.Book;
import fr.htc.library.model.Member;
import fr.htc.library.services.BookService;
import fr.htc.library.services.MemberService;
import fr.htc.library.services.impl.BookServiceImpl;
import fr.htc.library.services.impl.MemberServiceImpl;

public class MyLibraryLuncher {
	

	static MemberService memberService = new MemberServiceImpl();
	static BookService bookService  = new BookServiceImpl();
	
	public static void main(String[] args) {
		// ** save Members and get all
		memberService.createMember("MOUCHEN", "Djamel", 30);
		System.out.println("List avant : " + memberService.getMemberList());
		
		Member member = memberService.findMemberByMatricule("DM100");
		System.out.println(member);
		memberService.deleteMemberByMatricule("DM100");;
		System.out.println("List apres : " + memberService.getMemberList());
		
	
		// ** save Books abd get all books
		bookService.createBook("le Zahir", "Paolo", "2005");
		System.out.println("List avant : " + bookService.getBookList());
		
		Book book = bookService.findBookByCote("PA05-10");
		System.out.println("Book = " + book);
		
		
		
		bookService.deleteBookByCote("PA05-10");
		
		System.out.println("List apres : " + bookService.getBookList());
		
		
		
		
		

	}

}
