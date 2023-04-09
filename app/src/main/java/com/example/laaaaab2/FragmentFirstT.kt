package com.example.laab2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.laaaaab2.FragmentSecondT
import com.example.laaaaab2ab2.TrackAdapterT
import com.example.laaaab2.R
import com.example.laaaab2.databinding.FragmentFirstBinding


class FragmentFirstT : Fragment(), TrackAdapterT.Listener {

    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!

    var trackTS = ArrayList<trackT>()
    lateinit var adapter: TrackAdapterT

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val trackT1=trackT("Ні, я не ту кохав","Tartak, Світязь","У полоні темноти, наче сон з'явилась ти.\n" +
                "Та я прокинувся, тому що ти лишилась назавжди.\n" +
                "Я кохав тебе, як міг, квіти клав тобі до ніг,\n" +
                "Та білі мухи налетіли – вкрив любов холодний сніг.\n" +
                "Ця любов мене дістала – перед очима матиляла,\n" +
                "Цілий день, цілий день, цілий день мене пиляла!\n" +
                "І я спокій втрачав, я на тебе кричав,\n" +
                "Я горлянку зривав, як собака гарчав.\n" +
                "Програш.\n" +
                "Ну скільки вже можна мені тебе вчити –\n" +
                "Ти дай мені трошечки перепочити,\n" +
                "Ти вилізи з хати, ти піди погуляти –\n" +
                "Людей подивитись, себе показати.\n" +
                "Погуляла, покружляла, погуляла, покружляла,\n" +
                "Людей подивилась, себе показала.\n" +
                "Погуляла, покружляла, погуляла, покружляла,\n" +
                "Та до мене назад ти оглоблі вертала.\n" +
                "Ні, ні я не ту кохав, не ті слова я говорив!\n" +
                "Ні, ні я не ту чекав, не ту теплом своїм зігрів!\n" +
                "Ніч, ніч осліпила нас – блакитних снів жадана мить!\n" +
                "Ні, ні я не тій моливсь – любов украла ніч!\n" +
                "Мов настояне вино, випив я любов давно –\n" +
                "Так добряче нализався, що мені вже все одно.\n" +
                "Проживу без тебе я, ти давно вже не моя –\n" +
                "Опинилась у в'язниці, тепер бог тобі суддя.\n" +
                "Добре так, добре так – я тепер одинак!\n" +
                "Добре так, добре так – я тепер холостяк!\n" +
                "Та твоє миле обличчя мене знов до себе кличе,\n" +
                "І цієї мани не позбутись ніяк!\n" +
                "Програш.\n" +
                "Як приснишся вночі – то хоч бери та кричи –\n" +
                "Закриють очі глядачі, затулять вуха слухачі!\n" +
                "Не хочу знати, де ти, і знати, де тебе знайти.\n" +
                "Ти розумієш, чи ні? Ти не потрібна мені!\n" +
                ":\n" +
                "Ні, ні я не ту кохав, не ті слова я говорив!\n" +
                "Ні, ні я не ту чекав, не ту теплом своїм зігрів!\n" +
                "Ніч, ніч осліпила нас – блакитних снів жадана мить!\n" +
                "Ні, ні я не тій моливсь – любов украла ніч!","http://rockshop.com.ua/products_pictures/wvgycugiCbg.jpg" )
        val trackT2=trackT("Сірко-собака","хід у змінному взутті","Сірка ти знаєш, куме мій, Сірка собаку мойого,\n" +
                "Пішов раз я на полювання з ним - у зимку це було,\n" +
                "Рушницю взяв з собой, та ще і пістолєт!\n" +
                "І думав, що відмідь тодіся не врятує, нєт!\n" +
                "Пішов з Cірком на полювання, ага, я це казав,\n" +
                "Пішов раз я на відмідя, Сірка з собою взяв,\n" +
                "Сірко, собака мій, пішов зі мной на ведмедя,\n" +
                "А шо із того було - я розкажу погодя!\n" +
                "Сірко, собака мій, Сірко, собака мій, собака,\n" +
                "Сірко, собака мій, Сірко, собака мій, пес!\n" +
                "Запхав в рушницю в два стволи тугого жакана,\n" +
                "Ведмедя думав завалить чи може кабана,\n" +
                "З тваринами ціма у мене давняя война,\n" +
                "То ж думав справді я тоді, що ведмедю - хана.\n" +
                "І от прямую лісом та і бачу пагорба,\n" +
                "Там може, справді, спить ведмідь чи може то кабан,\n" +
                "Сірко за мной біжить, ти знаєш, куме, то мій пес,\n" +
                "Як я іду на ведмедя, беру його в лєс.\n" +
                "Сірко, собака мій, Сірко, собака мій, собака,\n" +
                "Сірко, собака мій, Сірко, собака мій, пес!\n" +
                "Якщо берлога із медведєм, де ж там голова?..\n" +
                "Ведмедя мудро вполювать - то не прості слова,\n" +
                "І бачу я із дірочки на пагорбі щось дмить,\n" +
                "То точно є берлога і там лежіть ведмідь.\n" +
                "Чи може то помилка є, оптіческий обман,\n" +
                "І то є не берлога і там сидить кабан,\n" +
                "Та мені страшно не було, рушницю ж я узяв,\n" +
                "Сірко, собака мій, мене із заду прикривав.\n" +
                "Сірко, собака мій, Сірко, собака мій, собака,\n" +
                "Сірко, собака мій, Сірко, собака мій, пес!\n" +
                "Якщо берлога поруч, то нема шляху назад,\n" +
                "Важливо знать, де голова, а де ведмедя зад.\n" +
                "Якщо нема шляху назад, то є \"питання два\",\n" +
                "І де в берлоги зад, а де, звиняюсь, голова?..\n" +
                "Пулять в ведмедя навмання - то виглядає тупо,\n" +
                "Важливо перш за все дізнатись, де голова, де дупа,\n" +
                "Є у берлоги горби два, один є трохи нищий,\n" +
                "Там мусить бути голова, а другий трохи вищий.\n" +
                "Того не розумію я й Сірко - то мій собака,\n" +
                "Де ж у берлоги голова, а де, звиняюсь, срака...\n" +
                "Сірко, собака мій, Сірко, собака мій, собака,\n" +
                "Сірко, собака мій, Сірко, собака мій, пес!\n" +
                "Забий собі у люльку трохи доброго табака,\n" +
                "Бо ми не палимо з Сірком, Сірко - то мій собака,\n" +
                "Налив сам собі одну, куме, бо в мене ще є,\n" +
                "А Сірко, собака мій, то він горілки не п'є.\n" +
                "Тож націлив я рушницю та влупав два жакана,\n" +
                "Туди, де голова, чи в ведмедя, чи в кабана,\n" +
                "Влупив та й затаївся, сам дихалку причаїв,\n" +
                "І з ведмедем покінчено, бо думаю, влучив.\n" +
                "І раптом ззаду щось важке мені на плечі - гець,\n" +
                "Чи то ведмідь, чи то кабан, все думаю - капець,\n" +
                "А сам і бачу, шо Сірко, і, шо Сірко, то чую я,\n" +
                "І розумію, шо Сірко та сру не переставая.\n" +
                "Сірко, собака мій, Сірко, собака мій, собака,\n" +
                "Сірко, собака мій, Сірко, собака мій, пес!\n" +
                "Сірко, собака мій, Сірко, собака мій, собака,\n" +
                "Сірко, собака мій, Сірко, собака мій, пес!","https://i.scdn.co/image/ab67616d00001e02ea0d5d82b8c26bc183ec2292")
        val trackT3=trackT("Шмата","Скрябін","Робота і хліб у чоловічих руках\n" +
                "Кириличні літери на збитих кулаках\n" +
                "Історії любові, історії війни\n" +
                "Діти щороку підростають восени\n" +
                "Ми всі тут залишаємось у будні й вихідні\n" +
                "Ікони у квартирах як портрети рідні\n" +
                "Все що необхідне для щоденного життя\n" +
                "Церква, супермаркет і мобільне покриття\n" +
                "Але хто ми з тобою?\n" +
                "Ми з тобою хрещені\n" +
                "Де ми хрещені?\n" +
                "В церкві на Троєщині\n" +
                "Це наші небеса і наші аномалії\n" +
                "У господа немає для нас автокефалії\n" +
                "Хто ми з тобою?\n" +
                "Ми з тобою хрещені\n" +
                "Де ми хрещені?\n" +
                "В церкві на Троєщині\n" +
                "Це наші небеса і наші аномалії\n" +
                "У господа немає для нас автокефалії\n" +
                "Духи змагаються за наші голоси\n" +
                "Ми ділимось останнім — тільки попроси\n" +
                "Над нами атмосфера, під нами глибина\n" +
                "Священик нагадає нам наші імена\n" +
                "Ми навіть не буваємо в збудованих церквах\n" +
                "Святі нам все детально пояснили на словах\n" +
                "Сльози висихатимуть росою на траві\n" +
                "Правда у тому, що ми іще живі\n" +
                "Але хто ми з тобою?\n" +
                "Ми з тобою хрещені\n" +
                "Де ми хрещені?\n" +
                "В церкві на Троєщині\n" +
                "Це наші небеса і наші аномалії\n" +
                "У господа немає для нас автокефалії\n" +
                "Хто ми з тобою?\n" +
                "Ми з тобою хрещені\n" +
                "Де ми хрещені?\n" +
                "В церкві на Троєщині\n" +
                "Це наші небеса і наші аномалії\n" +
                "У господа немає для нас автокефалії\n" +
                "Хто ми з тобою?\n" +
                "Де ми хрещені?\n" +
                "Це наші небеса і наші аномалії\n" +
                "У господа немає для нас автокефалії\n" +
                "Хто ми з тобою?\n" +
                "Ми з тобою хрещені\n" +
                "Де ми хрещені?\n" +
                "В церкві на Троєщині\n" +
                "Це наші небеса і наші аномалії\n" +
                "У господа немає для нас автокефалії\n" +
                "Але хто ми з тобою?\n" +
                "Ми з тобою хрещені\n" +
                "Де ми хрещені?\n" +
                "В церкві на Троєщині\n" +
                "Це наші небеса і наші аномалії\n" +
                "У господа немає для нас автокефалії\n" +
                "Хто ми з тобою?\n" +
                "Ми з тобою хрещені\n" +
                "Де ми хрещені?\n" +
                "В церкві на Троєщині\n" +
                "Це наші небеса і наші аномалії\n" +
                "У господа немає для нас автокефалії","https://imagecdn3.luxnet.ua/music/web/uploads/370x300_DIR/photo/song/201710/1840.jpg")
        var trackT4=trackT("Троєщина","Жадан і Собаки","Всі твої листи — то є макулатура\n" +
                "І ти мені не дівчина, а просто шмата\n" +
                "Вся твоя любов — то є чиста халтура\n" +
                "Хоч викинься з вікна, я не буду страждати\n" +
                "Всі твої листи — то є макулатура\n" +
                "І ти мені не дівчина, а просто шмата\n" +
                "Вся твоя любов — то є чиста халтура\n" +
                "Хоч викинься з вікна, я не буду страждати\n" +
                "Ти писала мені солодкі памфлєти\n" +
                "Навіть прислала раз пачку конфет\n" +
                "Ти ридала, пищала і обіцяла\n" +
                "Що серце своє ще нікому не дала\n" +
                "Ай-ай-ай-ай-ай-ай\n" +
                "Як дурний, то вигрібай!\n" +
                "Ай-ай-ай-ай-ай-ай\n" +
                "На, получай!\n" +
                "Всі твої листи — то є макулатура\n" +
                "І ти мені не дівчина, а просто шмата\n" +
                "Вся твоя любов — то є чиста халтура\n" +
                "Хоч викинься з вікна, я не буду страждати\n" +
                "Всі твої листи-ти-ти-ти-ти-ти-ти-ти є шмата\n" +
                "Всі твої листи-ти-ти-ти-ти-ти-ти-ти просто шмата\n" +
                "Поки з армії я ще не повернувся\n" +
                "Казала: \"Ні в кого я не влюблюся\"\n" +
                "Писала цитати чувіх-феміністок\n" +
                "І втікла в Єгипет з баскетболістом\n" +
                "Ай-ай-ай-ай-ай-ай\n" +
                "Як дурний, то вигрібай!\n" +
                "Ай-ай-ай-ай-ай-ай\n" +
                "На, получай!\n" +
                "Всі твої листи — то є макулатура\n" +
                "І ти мені не дівчина, а просто шмата\n" +
                "Вся твоя любов — то є чиста халтура\n" +
                "Хоч викинься з вікна, я не буду страждати\n" +
                "Всі твої листи-ти-ти-ти-ти-ти-ти-ти є шмата\n" +
                "Всі твої листи-ти-ти-ти-ти-ти-ти-ти просто шмата\n" +
                "Восени я дослужу, повернусь додому\n" +
                "Знайду собі дівчину нову чудову\n" +
                "Щоб не вміла читати, не вміла писати\n" +
                "І менше прийдеться добра вигрібати\n" +
                "Всі твої листи — то є макулатура\n" +
                "І ти мені не дівчина, а просто шмата\n" +
                "Вся твоя любов — то є чиста халтура\n" +
                "Хоч викинься з вікна, я не буду страждати\n" +
                "Всі твої листи — то є макулатура\n" +
                "І ти мені не дівчина, а просто шмата\n" +
                "Вся твоя любов — то є чиста халтура\n" +
                "Хоч викинься з вікна, я не буду страждати\n" +
                "Всі твої листи-ти-ти-ти-ти-ти-ти-ти є шмата\n" +
                "Всі твої листи-ти-ти-ти-ти-ти-ти-ти просто шмата\n" +
                "Шмата, шмата, шмата (ти просто шмата)\n" +
                "Шмата, шмата, шмата (звичайна шмата)\n" +
                "Шмата, шмата, шмата (порвана шмата)\n" +
                "Шмата, шмата, є!","https://image.karabas.com/files/activities/zhadan3.png")
        trackTS.add(trackT1)
        trackTS.add(trackT2)
        trackTS.add(trackT3)
        trackTS.add(trackT4)

        adapter = TrackAdapterT(this, trackTS, this)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val layoutManager = androidx.recyclerview.widget.LinearLayoutManager(context)
        binding.rV.layoutManager = layoutManager
        binding.rV.adapter = adapter
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    override fun onClick(itemView: Int) {
        val bundle = bundleOf(
            FragmentSecondT.numberInArray to itemView,
            FragmentSecondT.name to trackTS.get(itemView).name,
            FragmentSecondT.desc to trackTS.get(itemView).autor,
            FragmentSecondT.url to trackTS.get(itemView).image,
            FragmentSecondT.text to trackTS.get(itemView).text
        )
        findNavController().navigate(R.id.action_fragmentFirstT_to_fragmentSecondT, bundle)
    }


}