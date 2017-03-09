package com.example.administrator.secondtask.bean;

import java.util.List;

/**
 * Created by Administrator on 2017/2/28.
 */

public class ItemBean {

    @Override
    public String toString() {
        return "ItemBean{" +
                "reason='" + reason + '\'' +
                ", result=" + result +
                ", error_code=" + error_code +
                '}';
    }

    /**
     * reason : 成功的返回
     * result : {"stat":"1","data":[{"uniquekey":"5ddb0ee86a2449d880f9698f4dd2b614","title":"看完这段视频，谁敢保证日本不会再走上军国主义？","date":"2017-02-28 13:42","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170228134201516.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170228/20170228134201_6e66b1f700a51b0585dae9dde13369d3_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170228/20170228134201_6e66b1f700a51b0585dae9dde13369d3_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170228/20170228134201_6e66b1f700a51b0585dae9dde13369d3_3_mwpm_03200403.jpeg"},{"uniquekey":"bcf2058612a0484d0b18c3c7d3f42baa","title":"国家信访局局长\u201c开门纳谏\u201d  反复提\u201c老百姓\u201d30余次","date":"2017-02-28 13:53","category":"头条","author_name":"人民网-时政频道","url":"http://mini.eastday.com/mobile/170228135321582.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170228/20170228135321_d8fced9453739fa29371664477a27dca_1_mwpm_03200403.png"},{"uniquekey":"254153bb7a7dff20af2bce589adad940","title":"奥斯卡官方针对乌龙发声明致歉：普华永道负全责","date":"2017-02-28 13:09","category":"头条","author_name":"新浪娱乐","url":"http://mini.eastday.com/mobile/170228130945163.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170228/20170228130945_d7197ecd7c8a9131b23dcfd9a55c2649_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170228/20170228130945_d7197ecd7c8a9131b23dcfd9a55c2649_2_mwpm_03200403.jpeg"},{"uniquekey":"19e1cbe5dd9ab64120cdd4fd24f44d96","title":"南昌市红谷滩新区KTV火灾，为何是东湖区检察院介入","date":"2017-02-28 13:04","category":"头条","author_name":"微信公号\u201c江西政读\u201d","url":"http://mini.eastday.com/mobile/170228130434884.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170228/20170228130434_f31ce191b18bba9001647a959bd1a7ad_1_mwpm_03200403.jpeg"},{"uniquekey":"f4523eb870d22a817e2e1d60e6e5450c","title":"不吸烟也得肺癌？你可能忽略了这 5 个原因","date":"2017-02-28 12:31","category":"头条","author_name":"丁香医生","url":"http://mini.eastday.com/mobile/170228123114955.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170228/20170228123114_524e140fd43b0c06cacbccf761b3ba89_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170228/20170228123114_524e140fd43b0c06cacbccf761b3ba89_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20170228/20170228123114_524e140fd43b0c06cacbccf761b3ba89_3_mwpm_03200403.jpeg"},{"uniquekey":"02c560856470da61f8cf9010958912ab","title":"42岁港姐曾靠寻秦记一炮而红 被骂小三后下嫁穷小伙拍戏流产","date":"2017-02-28 12:23","category":"头条","author_name":"前瞻网","url":"http://mini.eastday.com/mobile/170228122300411.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170228/20170228122300_b864e9b771584002b109fa5da0ef4ea8_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170228/20170228122300_b864e9b771584002b109fa5da0ef4ea8_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170228/20170228122300_b864e9b771584002b109fa5da0ef4ea8_3_mwpm_03200403.jpeg"},{"uniquekey":"50bfcc8d6e356b1d5ddea62c7d3f9881","title":"44岁歌坛天后为嫁豪门隐退，如今离婚又患眼疾行动不便","date":"2017-02-28 12:17","category":"头条","author_name":"东方头条","url":"http://mini.eastday.com/mobile/170228121706166.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170228/20170228121706_07aa936b7309a3f52f1a66824c06350e_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170228/20170228121706_0e2f38ecac72178bd47a8786b20559bf_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170228/20170228121706_806cd194e670bc038ad89087b7a9b402_3_mwpm_03200403.png"},{"uniquekey":"c87d4b189eb4bca1d538d6730e07266f","title":"河北石家庄市政协副主席张维德被双开：收受礼金，搞权色交易","date":"2017-02-28 12:15","category":"头条","author_name":"中央纪委监察部网站","url":"http://mini.eastday.com/mobile/170228121545315.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170228/20170228121545_bf623df6e5378c8da87fdb68b1b413ca_1_mwpm_03200403.jpeg"},{"uniquekey":"f011d477fb9f9104b63065f0a93eaef7","title":"广东省委宣传部副部长莫高义拟作为地级市委书记人选考察对象","date":"2017-02-28 12:15","category":"头条","author_name":"澎湃新闻","url":"http://mini.eastday.com/mobile/170228121544847.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170228/20170228121544_995c90c4a76183b200e9687fda235e88_1_mwpm_03200403.jpeg"},{"uniquekey":"2bcf34e55ff384d9b0927101bc3d74fd","title":"台州一女司机辱骂脚踢交警还发帖炫耀，涉嫌妨碍公务罪被刑拘","date":"2017-02-28 12:15","category":"头条","author_name":"浙江新闻客户端","url":"http://mini.eastday.com/mobile/170228121544401.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170228/20170228121544_8cf075fb574bdca7f9a60a1c470d34a0_2_mwpm_03200403.jpeg"},{"uniquekey":"1a59805416937f50bf74aba645c41a8f","title":"麻辣财经：城市发展为何是\u201c一群一群\u201d的？","date":"2017-02-28 12:12","category":"头条","author_name":"人民日报中央厨房","url":"http://mini.eastday.com/mobile/170228121255283.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170228/20170228121255_a2720c688430352fc8b420a8a4a11001_2_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20170228/20170228121255_a2720c688430352fc8b420a8a4a11001_3_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20170228/20170228121255_a2720c688430352fc8b420a8a4a11001_4_mwpm_03200403.jpeg"},{"uniquekey":"e04c2ac263a7d2898d081adde747d6bd","title":"农村新娘结婚，份子钱竟然贴在墙上让他们围观，送的少的尴尬啊","date":"2017-02-28 12:11","category":"头条","author_name":"敬亭山","url":"http://mini.eastday.com/mobile/170228121158836.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170228/20170228121158_8adb0c26510e5e64e9072a5cd7194465_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170228/20170228121158_8adb0c26510e5e64e9072a5cd7194465_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170228/20170228121158_8adb0c26510e5e64e9072a5cd7194465_3_mwpm_03200403.jpeg"},{"uniquekey":"0ee3a8de1f27bd094416b4f315d11278","title":"孤寡老人挣30余万元，去世后存折上没一分钱，背后真情令人感动","date":"2017-02-28 12:11","category":"头条","author_name":"麒琅曦","url":"http://mini.eastday.com/mobile/170228121157582.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170228/20170228121157_bb349a751ec982c8a5b1de9a9e1289d6_1_mwpm_03200403.jpeg"},{"uniquekey":"280793d46305d1dfbebf118ab9a644d0","title":"赵乐际会见新加坡副总理张志贤","date":"2017-02-28 12:09","category":"头条","author_name":"新华社","url":"http://mini.eastday.com/mobile/170228120930565.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170228/20170228120930_1aad3c99babbb19e17feee82de0c8fef_1_mwpm_03200403.jpeg"},{"uniquekey":"67cde2ffc8b9d3270d991c967cc5bd23","title":"为什么吕后死后惨被奸尸？","date":"2017-02-28 12:03","category":"头条","author_name":"趣历史","url":"http://mini.eastday.com/mobile/170228120341383.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170228/20170228120341_680db9c369d260dde827a682e17cb562_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20170228/20170228120341_680db9c369d260dde827a682e17cb562_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20170228/20170228120341_680db9c369d260dde827a682e17cb562_3_mwpm_03200403.jpeg"},{"uniquekey":"8a5be0bf070c30b67a3992cda9543f0a","title":"重庆女子酒店开房满床血 床单里藏男婴","date":"2017-02-28 11:59","category":"头条","author_name":"三峡新闻网\u2014三峡晚报","url":"http://mini.eastday.com/mobile/170228115953423.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170228/20170228115953_82480070668f1be90d390593a001e72b_1_mwpm_03200403.jpeg"},{"uniquekey":"b4755d62c9344f2d6bac6ee2cc9efe6a","title":"上海交通大学原校长张杰出任中国科学院副院长","date":"2017-02-28 11:59","category":"头条","author_name":"国务院客户端","url":"http://mini.eastday.com/mobile/170228115921379.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170228/20170228115921_3b1227f7665a19212fb4c59496605f94_1_mwpm_03200403.jpeg"},{"uniquekey":"a542919fc12d68fcfd3644d5431460c1","title":"舒淇为公益短片配音 呼吁远离动物园和水族馆","date":"2017-02-28 11:54","category":"头条","author_name":"新浪娱乐","url":"http://mini.eastday.com/mobile/170228115457857.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170228/20170228115457_9846f1b4438985c86b6f0aefd872d62f_1_mwpm_03200403.jpeg"},{"uniquekey":"0457f25c8f9d82f927b6875f8de2b9ce","title":"东方八卦：大奖发错奥斯卡闹史上最大乌龙，英达称非法背钱是为儿子交学费，鹿晗怒怼\u201c私生饭\u201d","date":"2017-02-28 11:43","category":"头条","author_name":"东方头条","url":"http://mini.eastday.com/mobile/170228114330271.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170228/20170228114330_7171039b072824f76f5f56ba7c045fb3_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170228/20170228114330_ac0c64c426d1cab3cc44cea316d31939_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170228/20170228114330_1b0a69bae8d4dd11f7f188efb6cb3f05_3_mwpm_03200403.jpg"},{"uniquekey":"856b7022a78a73f36a9dd014ab54edfb","title":"\u201c龙象之争\u201d印度已在三个方面领先中国","date":"2017-02-28 11:43","category":"头条","author_name":"热点军","url":"http://mini.eastday.com/mobile/170228114309986.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170228/20170228114309_85706e44cbcfcde589273ed65945ef8b_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170228/20170228114309_85706e44cbcfcde589273ed65945ef8b_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20170228/20170228114309_85706e44cbcfcde589273ed65945ef8b_3_mwpm_03200403.jpeg"},{"uniquekey":"467e59a741ede12cca31967483b15d14","title":"德国这家公司正要\u201c倾家荡产\u201d，却意外成就了中国最知名步枪","date":"2017-02-28 11:36","category":"头条","author_name":"兵帅传奇","url":"http://mini.eastday.com/mobile/170228113654685.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170228/20170228113654_fa0603f640eebc59b5dedfed83e556e7_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20170228/20170228113654_fa0603f640eebc59b5dedfed83e556e7_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20170228/20170228113654_fa0603f640eebc59b5dedfed83e556e7_3_mwpm_03200403.jpeg"},{"uniquekey":"ddf37fa46cb8394d4bd27120e8bce6e6","title":"农村土地承包新规出台，今年这四类土地是拿不到财政补贴的了！","date":"2017-02-28 11:36","category":"头条","author_name":"创客新农人","url":"http://mini.eastday.com/mobile/170228113637344.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170228/20170228113637_76c12946ad29eb626d4e57253b7cd893_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170228/20170228113637_76c12946ad29eb626d4e57253b7cd893_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170228/20170228113637_76c12946ad29eb626d4e57253b7cd893_3_mwpm_03200403.jpeg"},{"uniquekey":"c6ba3079190dd4ad5ab299819e951167","title":"蒋欣控诉潜规则 娱乐圈拼干爹戏霸炒作潜规则成风","date":"2017-02-28 11:32","category":"头条","author_name":"国际在线综合","url":"http://mini.eastday.com/mobile/170228113225820.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170228/20170228113225_5e7e50ab4b8e662caaa09283c90718d3_1_mwpm_03200403.png"},{"uniquekey":"4188db5b59c7d65295034b8dab4c384d","title":"大学生拆除蒋介石像 台\u201c总统府\u201d发言人：正面看待","date":"2017-02-28 11:30","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170228113038772.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170228/20170228113038_f496407f8cc06859a2e5337041738ab4_1_mwpm_03200403.jpeg"},{"uniquekey":"b3d6fc49693d4a782a6eb82b15322429","title":"这3个生肖的家庭，2017年添丁添财","date":"2017-02-28 11:26","category":"头条","author_name":"星星宿说","url":"http://mini.eastday.com/mobile/170228112644537.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170228/20170228112644_7b520bffcfe7d65aa1e72c6c0cba0a6f_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170228/20170228112644_7b520bffcfe7d65aa1e72c6c0cba0a6f_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170228/20170228112644_7b520bffcfe7d65aa1e72c6c0cba0a6f_3_mwpm_03200403.jpeg"},{"uniquekey":"2353890d2d8dfe4a9d8c73e3f74fb628","title":"特朗普斥奥斯卡\u201c过度政治化\u201d：忙着黑我 搞砸了吧","date":"2017-02-28 11:25","category":"头条","author_name":"美洲日报","url":"http://mini.eastday.com/mobile/170228112545409.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170228/20170228112545_cab63584f8496c1c1da6528b9b004101_1_mwpm_03200403.jpeg"},{"uniquekey":"1afb8e7187f570d7c05067c9033fad1a","title":"农村大叔花费1万多制造了一辆风电汽车，秒变全村焦点","date":"2017-02-28 11:25","category":"头条","author_name":"印象广西","url":"http://mini.eastday.com/mobile/170228112524364.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170228/20170228112524_35345fc62c8bc15068151801edaae01d_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170228/20170228112524_35345fc62c8bc15068151801edaae01d_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20170228/20170228112524_35345fc62c8bc15068151801edaae01d_3_mwpm_03200403.jpeg"},{"uniquekey":"9ee29a2e5334db01e58ecd40db12a31f","title":"美航母若航行中突然掉头能躲开中国攻击吗？真相让美海军选择沉默","date":"2017-02-28 11:23","category":"头条","author_name":"鹰眼图说军事","url":"http://mini.eastday.com/mobile/170228112349431.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170228/20170228112349_5eb12cb9d182fd600a0969e3f9ae1b97_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170228/20170228112349_5eb12cb9d182fd600a0969e3f9ae1b97_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170228/20170228112349_5eb12cb9d182fd600a0969e3f9ae1b97_3_mwpm_03200403.jpeg"},{"uniquekey":"505c5a8062153f06e9d8d202ec3014d6","title":"只因被踢出微信群　无锡一男子持刀砍\u201c群主\u201d","date":"2017-02-28 11:22","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/170228112230983.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170228/20170228112230_7b57def71fb76dbd2e0d585b598ebd45_1_mwpm_03200403.png"},{"uniquekey":"68b5aa22535a912b68fdd5f0fbb3a345","title":"韩国应用AI技术翻译历史文献 用时将缩短27年","date":"2017-02-28 11:22","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170228112216135.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170228/20170228112216_9c6a3ff0363b56026a4858c2f44be9c3_1_mwpm_03200403.jpeg"}]}
     * error_code : 0
     */

    private String reason;
    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        @Override
        public String toString() {
            return "ResultBean{" +
                    "stat='" + stat + '\'' +
                    ", data=" + data +
                    '}';
        }

        /**
         * stat : 1
         * data : [{"uniquekey":"5ddb0ee86a2449d880f9698f4dd2b614","title":"看完这段视频，谁敢保证日本不会再走上军国主义？","date":"2017-02-28 13:42","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170228134201516.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170228/20170228134201_6e66b1f700a51b0585dae9dde13369d3_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170228/20170228134201_6e66b1f700a51b0585dae9dde13369d3_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170228/20170228134201_6e66b1f700a51b0585dae9dde13369d3_3_mwpm_03200403.jpeg"},{"uniquekey":"bcf2058612a0484d0b18c3c7d3f42baa","title":"国家信访局局长\u201c开门纳谏\u201d  反复提\u201c老百姓\u201d30余次","date":"2017-02-28 13:53","category":"头条","author_name":"人民网-时政频道","url":"http://mini.eastday.com/mobile/170228135321582.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170228/20170228135321_d8fced9453739fa29371664477a27dca_1_mwpm_03200403.png"},{"uniquekey":"254153bb7a7dff20af2bce589adad940","title":"奥斯卡官方针对乌龙发声明致歉：普华永道负全责","date":"2017-02-28 13:09","category":"头条","author_name":"新浪娱乐","url":"http://mini.eastday.com/mobile/170228130945163.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170228/20170228130945_d7197ecd7c8a9131b23dcfd9a55c2649_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170228/20170228130945_d7197ecd7c8a9131b23dcfd9a55c2649_2_mwpm_03200403.jpeg"},{"uniquekey":"19e1cbe5dd9ab64120cdd4fd24f44d96","title":"南昌市红谷滩新区KTV火灾，为何是东湖区检察院介入","date":"2017-02-28 13:04","category":"头条","author_name":"微信公号\u201c江西政读\u201d","url":"http://mini.eastday.com/mobile/170228130434884.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170228/20170228130434_f31ce191b18bba9001647a959bd1a7ad_1_mwpm_03200403.jpeg"},{"uniquekey":"f4523eb870d22a817e2e1d60e6e5450c","title":"不吸烟也得肺癌？你可能忽略了这 5 个原因","date":"2017-02-28 12:31","category":"头条","author_name":"丁香医生","url":"http://mini.eastday.com/mobile/170228123114955.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170228/20170228123114_524e140fd43b0c06cacbccf761b3ba89_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170228/20170228123114_524e140fd43b0c06cacbccf761b3ba89_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20170228/20170228123114_524e140fd43b0c06cacbccf761b3ba89_3_mwpm_03200403.jpeg"},{"uniquekey":"02c560856470da61f8cf9010958912ab","title":"42岁港姐曾靠寻秦记一炮而红 被骂小三后下嫁穷小伙拍戏流产","date":"2017-02-28 12:23","category":"头条","author_name":"前瞻网","url":"http://mini.eastday.com/mobile/170228122300411.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170228/20170228122300_b864e9b771584002b109fa5da0ef4ea8_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170228/20170228122300_b864e9b771584002b109fa5da0ef4ea8_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170228/20170228122300_b864e9b771584002b109fa5da0ef4ea8_3_mwpm_03200403.jpeg"},{"uniquekey":"50bfcc8d6e356b1d5ddea62c7d3f9881","title":"44岁歌坛天后为嫁豪门隐退，如今离婚又患眼疾行动不便","date":"2017-02-28 12:17","category":"头条","author_name":"东方头条","url":"http://mini.eastday.com/mobile/170228121706166.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170228/20170228121706_07aa936b7309a3f52f1a66824c06350e_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170228/20170228121706_0e2f38ecac72178bd47a8786b20559bf_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170228/20170228121706_806cd194e670bc038ad89087b7a9b402_3_mwpm_03200403.png"},{"uniquekey":"c87d4b189eb4bca1d538d6730e07266f","title":"河北石家庄市政协副主席张维德被双开：收受礼金，搞权色交易","date":"2017-02-28 12:15","category":"头条","author_name":"中央纪委监察部网站","url":"http://mini.eastday.com/mobile/170228121545315.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170228/20170228121545_bf623df6e5378c8da87fdb68b1b413ca_1_mwpm_03200403.jpeg"},{"uniquekey":"f011d477fb9f9104b63065f0a93eaef7","title":"广东省委宣传部副部长莫高义拟作为地级市委书记人选考察对象","date":"2017-02-28 12:15","category":"头条","author_name":"澎湃新闻","url":"http://mini.eastday.com/mobile/170228121544847.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170228/20170228121544_995c90c4a76183b200e9687fda235e88_1_mwpm_03200403.jpeg"},{"uniquekey":"2bcf34e55ff384d9b0927101bc3d74fd","title":"台州一女司机辱骂脚踢交警还发帖炫耀，涉嫌妨碍公务罪被刑拘","date":"2017-02-28 12:15","category":"头条","author_name":"浙江新闻客户端","url":"http://mini.eastday.com/mobile/170228121544401.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170228/20170228121544_8cf075fb574bdca7f9a60a1c470d34a0_2_mwpm_03200403.jpeg"},{"uniquekey":"1a59805416937f50bf74aba645c41a8f","title":"麻辣财经：城市发展为何是\u201c一群一群\u201d的？","date":"2017-02-28 12:12","category":"头条","author_name":"人民日报中央厨房","url":"http://mini.eastday.com/mobile/170228121255283.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170228/20170228121255_a2720c688430352fc8b420a8a4a11001_2_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20170228/20170228121255_a2720c688430352fc8b420a8a4a11001_3_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20170228/20170228121255_a2720c688430352fc8b420a8a4a11001_4_mwpm_03200403.jpeg"},{"uniquekey":"e04c2ac263a7d2898d081adde747d6bd","title":"农村新娘结婚，份子钱竟然贴在墙上让他们围观，送的少的尴尬啊","date":"2017-02-28 12:11","category":"头条","author_name":"敬亭山","url":"http://mini.eastday.com/mobile/170228121158836.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170228/20170228121158_8adb0c26510e5e64e9072a5cd7194465_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170228/20170228121158_8adb0c26510e5e64e9072a5cd7194465_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170228/20170228121158_8adb0c26510e5e64e9072a5cd7194465_3_mwpm_03200403.jpeg"},{"uniquekey":"0ee3a8de1f27bd094416b4f315d11278","title":"孤寡老人挣30余万元，去世后存折上没一分钱，背后真情令人感动","date":"2017-02-28 12:11","category":"头条","author_name":"麒琅曦","url":"http://mini.eastday.com/mobile/170228121157582.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170228/20170228121157_bb349a751ec982c8a5b1de9a9e1289d6_1_mwpm_03200403.jpeg"},{"uniquekey":"280793d46305d1dfbebf118ab9a644d0","title":"赵乐际会见新加坡副总理张志贤","date":"2017-02-28 12:09","category":"头条","author_name":"新华社","url":"http://mini.eastday.com/mobile/170228120930565.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170228/20170228120930_1aad3c99babbb19e17feee82de0c8fef_1_mwpm_03200403.jpeg"},{"uniquekey":"67cde2ffc8b9d3270d991c967cc5bd23","title":"为什么吕后死后惨被奸尸？","date":"2017-02-28 12:03","category":"头条","author_name":"趣历史","url":"http://mini.eastday.com/mobile/170228120341383.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170228/20170228120341_680db9c369d260dde827a682e17cb562_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20170228/20170228120341_680db9c369d260dde827a682e17cb562_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20170228/20170228120341_680db9c369d260dde827a682e17cb562_3_mwpm_03200403.jpeg"},{"uniquekey":"8a5be0bf070c30b67a3992cda9543f0a","title":"重庆女子酒店开房满床血 床单里藏男婴","date":"2017-02-28 11:59","category":"头条","author_name":"三峡新闻网\u2014三峡晚报","url":"http://mini.eastday.com/mobile/170228115953423.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170228/20170228115953_82480070668f1be90d390593a001e72b_1_mwpm_03200403.jpeg"},{"uniquekey":"b4755d62c9344f2d6bac6ee2cc9efe6a","title":"上海交通大学原校长张杰出任中国科学院副院长","date":"2017-02-28 11:59","category":"头条","author_name":"国务院客户端","url":"http://mini.eastday.com/mobile/170228115921379.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170228/20170228115921_3b1227f7665a19212fb4c59496605f94_1_mwpm_03200403.jpeg"},{"uniquekey":"a542919fc12d68fcfd3644d5431460c1","title":"舒淇为公益短片配音 呼吁远离动物园和水族馆","date":"2017-02-28 11:54","category":"头条","author_name":"新浪娱乐","url":"http://mini.eastday.com/mobile/170228115457857.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170228/20170228115457_9846f1b4438985c86b6f0aefd872d62f_1_mwpm_03200403.jpeg"},{"uniquekey":"0457f25c8f9d82f927b6875f8de2b9ce","title":"东方八卦：大奖发错奥斯卡闹史上最大乌龙，英达称非法背钱是为儿子交学费，鹿晗怒怼\u201c私生饭\u201d","date":"2017-02-28 11:43","category":"头条","author_name":"东方头条","url":"http://mini.eastday.com/mobile/170228114330271.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170228/20170228114330_7171039b072824f76f5f56ba7c045fb3_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170228/20170228114330_ac0c64c426d1cab3cc44cea316d31939_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170228/20170228114330_1b0a69bae8d4dd11f7f188efb6cb3f05_3_mwpm_03200403.jpg"},{"uniquekey":"856b7022a78a73f36a9dd014ab54edfb","title":"\u201c龙象之争\u201d印度已在三个方面领先中国","date":"2017-02-28 11:43","category":"头条","author_name":"热点军","url":"http://mini.eastday.com/mobile/170228114309986.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170228/20170228114309_85706e44cbcfcde589273ed65945ef8b_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170228/20170228114309_85706e44cbcfcde589273ed65945ef8b_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20170228/20170228114309_85706e44cbcfcde589273ed65945ef8b_3_mwpm_03200403.jpeg"},{"uniquekey":"467e59a741ede12cca31967483b15d14","title":"德国这家公司正要\u201c倾家荡产\u201d，却意外成就了中国最知名步枪","date":"2017-02-28 11:36","category":"头条","author_name":"兵帅传奇","url":"http://mini.eastday.com/mobile/170228113654685.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170228/20170228113654_fa0603f640eebc59b5dedfed83e556e7_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20170228/20170228113654_fa0603f640eebc59b5dedfed83e556e7_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20170228/20170228113654_fa0603f640eebc59b5dedfed83e556e7_3_mwpm_03200403.jpeg"},{"uniquekey":"ddf37fa46cb8394d4bd27120e8bce6e6","title":"农村土地承包新规出台，今年这四类土地是拿不到财政补贴的了！","date":"2017-02-28 11:36","category":"头条","author_name":"创客新农人","url":"http://mini.eastday.com/mobile/170228113637344.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170228/20170228113637_76c12946ad29eb626d4e57253b7cd893_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170228/20170228113637_76c12946ad29eb626d4e57253b7cd893_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170228/20170228113637_76c12946ad29eb626d4e57253b7cd893_3_mwpm_03200403.jpeg"},{"uniquekey":"c6ba3079190dd4ad5ab299819e951167","title":"蒋欣控诉潜规则 娱乐圈拼干爹戏霸炒作潜规则成风","date":"2017-02-28 11:32","category":"头条","author_name":"国际在线综合","url":"http://mini.eastday.com/mobile/170228113225820.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170228/20170228113225_5e7e50ab4b8e662caaa09283c90718d3_1_mwpm_03200403.png"},{"uniquekey":"4188db5b59c7d65295034b8dab4c384d","title":"大学生拆除蒋介石像 台\u201c总统府\u201d发言人：正面看待","date":"2017-02-28 11:30","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170228113038772.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170228/20170228113038_f496407f8cc06859a2e5337041738ab4_1_mwpm_03200403.jpeg"},{"uniquekey":"b3d6fc49693d4a782a6eb82b15322429","title":"这3个生肖的家庭，2017年添丁添财","date":"2017-02-28 11:26","category":"头条","author_name":"星星宿说","url":"http://mini.eastday.com/mobile/170228112644537.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170228/20170228112644_7b520bffcfe7d65aa1e72c6c0cba0a6f_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170228/20170228112644_7b520bffcfe7d65aa1e72c6c0cba0a6f_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170228/20170228112644_7b520bffcfe7d65aa1e72c6c0cba0a6f_3_mwpm_03200403.jpeg"},{"uniquekey":"2353890d2d8dfe4a9d8c73e3f74fb628","title":"特朗普斥奥斯卡\u201c过度政治化\u201d：忙着黑我 搞砸了吧","date":"2017-02-28 11:25","category":"头条","author_name":"美洲日报","url":"http://mini.eastday.com/mobile/170228112545409.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170228/20170228112545_cab63584f8496c1c1da6528b9b004101_1_mwpm_03200403.jpeg"},{"uniquekey":"1afb8e7187f570d7c05067c9033fad1a","title":"农村大叔花费1万多制造了一辆风电汽车，秒变全村焦点","date":"2017-02-28 11:25","category":"头条","author_name":"印象广西","url":"http://mini.eastday.com/mobile/170228112524364.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170228/20170228112524_35345fc62c8bc15068151801edaae01d_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170228/20170228112524_35345fc62c8bc15068151801edaae01d_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20170228/20170228112524_35345fc62c8bc15068151801edaae01d_3_mwpm_03200403.jpeg"},{"uniquekey":"9ee29a2e5334db01e58ecd40db12a31f","title":"美航母若航行中突然掉头能躲开中国攻击吗？真相让美海军选择沉默","date":"2017-02-28 11:23","category":"头条","author_name":"鹰眼图说军事","url":"http://mini.eastday.com/mobile/170228112349431.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170228/20170228112349_5eb12cb9d182fd600a0969e3f9ae1b97_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170228/20170228112349_5eb12cb9d182fd600a0969e3f9ae1b97_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170228/20170228112349_5eb12cb9d182fd600a0969e3f9ae1b97_3_mwpm_03200403.jpeg"},{"uniquekey":"505c5a8062153f06e9d8d202ec3014d6","title":"只因被踢出微信群　无锡一男子持刀砍\u201c群主\u201d","date":"2017-02-28 11:22","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/170228112230983.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170228/20170228112230_7b57def71fb76dbd2e0d585b598ebd45_1_mwpm_03200403.png"},{"uniquekey":"68b5aa22535a912b68fdd5f0fbb3a345","title":"韩国应用AI技术翻译历史文献 用时将缩短27年","date":"2017-02-28 11:22","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170228112216135.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170228/20170228112216_9c6a3ff0363b56026a4858c2f44be9c3_1_mwpm_03200403.jpeg"}]
         */

        private String stat;
        private List<DataBean> data;

        public String getStat() {
            return stat;
        }

        public void setStat(String stat) {
            this.stat = stat;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            @Override
            public String toString() {
                return "DataBean{" +
                        "uniquekey='" + uniquekey + '\'' +
                        ", title='" + title + '\'' +
                        ", date='" + date + '\'' +
                        ", category='" + category + '\'' +
                        ", author_name='" + author_name + '\'' +
                        ", url='" + url + '\'' +
                        ", thumbnail_pic_s='" + thumbnail_pic_s + '\'' +
                        ", thumbnail_pic_s02='" + thumbnail_pic_s02 + '\'' +
                        ", thumbnail_pic_s03='" + thumbnail_pic_s03 + '\'' +
                        '}';
            }

            /**
             * uniquekey : 5ddb0ee86a2449d880f9698f4dd2b614
             * title : 看完这段视频，谁敢保证日本不会再走上军国主义？
             * date : 2017-02-28 13:42
             * category : 头条
             * author_name : 环球网
             * url : http://mini.eastday.com/mobile/170228134201516.html
             * thumbnail_pic_s : http://09.imgmini.eastday.com/mobile/20170228/20170228134201_6e66b1f700a51b0585dae9dde13369d3_1_mwpm_03200403.jpeg
             * thumbnail_pic_s02 : http://09.imgmini.eastday.com/mobile/20170228/20170228134201_6e66b1f700a51b0585dae9dde13369d3_2_mwpm_03200403.jpeg
             * thumbnail_pic_s03 : http://09.imgmini.eastday.com/mobile/20170228/20170228134201_6e66b1f700a51b0585dae9dde13369d3_3_mwpm_03200403.jpeg
             */

            private String uniquekey;
            private String title;
            private String date;
            private String category;
            private String author_name;
            private String url;
            private String thumbnail_pic_s;
            private String thumbnail_pic_s02;
            private String thumbnail_pic_s03;

            public String getUniquekey() {
                return uniquekey;
            }

            public void setUniquekey(String uniquekey) {
                this.uniquekey = uniquekey;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getThumbnail_pic_s() {
                return thumbnail_pic_s;
            }

            public void setThumbnail_pic_s(String thumbnail_pic_s) {
                this.thumbnail_pic_s = thumbnail_pic_s;
            }

            public String getThumbnail_pic_s02() {
                return thumbnail_pic_s02;
            }

            public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
                this.thumbnail_pic_s02 = thumbnail_pic_s02;
            }

            public String getThumbnail_pic_s03() {
                return thumbnail_pic_s03;
            }

            public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
                this.thumbnail_pic_s03 = thumbnail_pic_s03;
            }
        }
    }
}
