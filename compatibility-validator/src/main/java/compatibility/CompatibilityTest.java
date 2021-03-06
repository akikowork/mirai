package compatibility;

import net.mamoe.mirai.Bot;
import net.mamoe.mirai.BotFactoryJvm;
import net.mamoe.mirai.message.data.MessageUtils;

/*
 * Copyright 2020 Mamoe Technologies and contributors.
 *
 * 此源代码的使用受 GNU AFFERO GENERAL PUBLIC LICENSE version 3 许可证的约束, 可以在以下链接找到该许可证.
 * Use of this source code is governed by the GNU AGPLv3 license that can be found through the following link.
 *
 * https://github.com/mamoe/mirai/blob/master/LICENSE
 */
public class CompatibilityTest {
    public static void main(String[] args) {
        Bot bot = BotFactoryJvm.newBot(Long.parseLong(System.getenv("qq")), System.getenv("password"));

        bot.getFriend(123).sendMessage(MessageUtils.newChain("")
                .plus("")
                .plus(MessageUtils.newImage("")));
        bot.getFriend(123).sendMessage("");
    }
}
