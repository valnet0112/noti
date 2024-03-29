package kr.or.ddit.bts.exception;

/**
 * MBTI 유형이 존재하지 않을 때 발생시킬 에러.
 *
 */
public class BtsNotFoundException extends RuntimeException{

	public BtsNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BtsNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public BtsNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public BtsNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public BtsNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
