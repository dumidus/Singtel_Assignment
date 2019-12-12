package com.singtel.assignment;

public class Parrot extends Bird{
	
	private Animal livedWith = null;
	
	/* (non-Javadoc)
	 * @see com.singtel.assignment.Bird#isSing()
	 */
	@Override
	public boolean isSing() {
		if(livedWith != null)
		{
			return livedWith.isSing();
		}
		else
		{
			return super.isSing();
		}
	}


	/* (non-Javadoc)
	 * @see com.singtel.assignment.Bird#isWalk()
	 */
	@Override
	public boolean isWalk() {
		return super.isWalk();
	}

	/* (non-Javadoc)
	 * @see com.singtel.assignment.Bird#isFly()
	 */
	@Override
	public boolean isFly() {
		return super.isFly();
	}
	
	/* (non-Javadoc)
	 * @see com.singtel.assignment.Bird#isSwimm()
	 */
	@Override
	public boolean isSwimm() {
		return super.isSwimm();
	}


	/**
	 * @param livedWith the livedWith to set
	 */
	public void setLivedWith(Animal livedWith) {
		this.livedWith = livedWith;
	}

}
