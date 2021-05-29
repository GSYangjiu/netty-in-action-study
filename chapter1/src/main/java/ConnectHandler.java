import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * @author Vincent
 * Email: vincent1094259423@yahoo.com
 * CreateTime: 2021/5/28 11:14 下午
 * Description：
 */
public class ConnectHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("Client" + ctx.channel().remoteAddress() + " connected");
    }
}
