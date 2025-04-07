package edu.kis.vh.nursery;

/**
 * Class extending defaultCountingOutRhymer
 */
public class FIFORhymer extends defaultCountingOutRhymer {

	private final defaultCountingOutRhymer tmp = new defaultCountingOutRhymer();

	/**
	 * override of default countOut
	 */
	@Override
	public int countOut() {
		while (!callCheck())

			tmp.countIn(super.countOut());

		int ret = tmp.countOut();

		while (!tmp.callCheck())

			countIn(tmp.countOut());

		return ret;
	}
}
