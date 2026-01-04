package hello.core.mbmer;

public interface MemberRepository {

    void save(Member member);

    Member findById(Long memberId);
}
