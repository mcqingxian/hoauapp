package com.hoau.hoauapp.business;

import com.hoau.hoauapp.entity.User;
import com.hoau.hoauapp.vo.NewFeedbackVo;
import com.hoau.hoauapp.vo.NewFeedbackListVo;
import com.hoau.hoauapp.vo.ResBaseVo;

public interface INewFeedbackService {

	public ResBaseVo addNewFeedback(NewFeedbackVo newvo);
	public NewFeedbackListVo findNewFeedback(User user);
}
