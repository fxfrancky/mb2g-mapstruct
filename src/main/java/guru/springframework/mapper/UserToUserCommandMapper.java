package guru.springframework.mapper;

import guru.springframework.model.User;
import guru.springframework.model.UserCommand;
import org.mapstruct.Mapper;

@Mapper
public interface UserToUserCommandMapper {

    User UserCommandToUserMapper(UserCommand usrCommand);

    UserCommand UserToUserCommandMapper(User usr);

}
