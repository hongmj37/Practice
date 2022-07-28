package Service;

import Entity.Member;

public interface DiscountPolicy {
    int discount(Member member, int price);
}
