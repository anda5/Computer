/**
 * Created by anda on 11/28/2015.
 */
public enum RomanNumber {

    THOUSAND_ZERO (" "),
    THOUSAND_ONE ("M"),
    THOUSAND_TWO  ("MM"),
    THOUSAND_THREE("MMM"),
    HUNDRED_ZERO(" "),
    HUNDRED_ONE ("C"),
    HUNDRED_TWO ("CC"),
    HUNDRED_THREE ("CCC"),
    HUNDRED_FOUR ("CD"),
    HUNDRED_FIVE ("D"),
    HUNDRED_SIX ("DC"),
    HUNDRED_SEVEN ("DCC"),
    HUNDRED_EIGHT ("DCCC"),
    HUNDRED_NINE ("CM"),
    TENS_ZERO(" "),
    TENS_ONE ("X"),
    TENS_TWO ("XX"),
    TENS_THREE ("XXX"),
    TENS_FOUR ("XL"),
    TENS_FIVE ("L"),
    TENS_SIX ("LX"),
    TENS_SEVEN ("LXX"),
    TENS_EIGHT ("LXXX"),
    TENS_NINE ("XC"),
    UNIT_ZERO(" "),
    UNIT_ONE ("I"),
    UNIT_TWO ("II"),
    UNIT_THREE("III"),
    UNIT_FOUR ("IV"),
    UNIT_FIVE("V"),
    UNIT_SIX ("VI"),
    UNIT_SEVEN ("VII"),
    UNIT_EIGHT ("VIII"),
    UNIT_NINE ("IX");

    private String _value;

    private RomanNumber(String value) {
        this._value = value;
    }
    public String getValue() {
        return _value;
    }

}
