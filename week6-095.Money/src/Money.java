
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public Money plus(Money added) {
        return new Money(this.euros + added.euros, this.cents + added.cents);
    }

    public boolean less(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        } else if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        }
        return false;
    }

    public Money minus(Money decremented) {
        if (this.less(decremented)) {
            return new Money(0, 0);
        } else if (this.cents - decremented.cents < 0) {
            return new Money(this.euros - decremented.euros - 1,
                    100 - decremented.cents);
        } else if (this.cents < decremented.cents) {
            return new Money(this.euros - decremented.euros - 1,
                    this.cents - decremented.cents);
        }
        return new Money(this.euros - decremented.euros,
                this.cents - decremented.cents);
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
